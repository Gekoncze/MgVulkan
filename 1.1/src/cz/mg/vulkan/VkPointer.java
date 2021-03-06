package cz.mg.vulkan;

public class VkPointer extends VkObject {
    public static final long NULL = 0;

    public VkPointer() {
        super(sizeof());
    }

    public VkPointer(long value) {
        super(sizeof());
        setValue(value);
    }

    protected VkPointer(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPointer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public long getValue() {
        return getValueNative(getVkAddress());
    }

    public void setValue(long value) {
        setValueNative(getVkAddress(), value);
    }

    public static native long sizeof();
    public static native long plus(long address, long offset);
    protected static native long getValueNative(long vkaddress);
    protected static native void setValueNative(long vkaddress, long value);
    protected static native long getNullAddressNative();
    protected static native long getSinkAddressNative();

    @Override
    public String toString() {
        return "0x" + Long.toHexString(getValue());
    }

    public static class Array extends VkPointer implements cz.mg.collections.array.ReadonlyArray<VkPointer> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPointer.sizeof()));
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }

        public Array(long... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValue(i, values[i]);
        }
        
        public long getValue(int i){
            return getValueNative(address(i));
        }

        public void setValue(int i, long value){
            setValueNative(address(i), value);
        }



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPointer get(int i){
            return new VkPointer(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }
}

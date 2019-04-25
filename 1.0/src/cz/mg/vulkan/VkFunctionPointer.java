package cz.mg.vulkan;

public class VkFunctionPointer extends VkObject {
    public static final long NULL = 0;

    public VkFunctionPointer() {
        super(sizeof());
    }

    public VkFunctionPointer(long value) {
        super(sizeof());
        setValue(value);
    }

    public VkFunctionPointer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFunctionPointer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkFunctionPointer(VkInstance instance, VkString name) {
        super(sizeof());
        loadNative(getVkAddress(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), name.getVkAddress());
        if(getValue() == NULL) throw new RuntimeException("Could not load vulkan function " + name);
    }

    public long getValue() {
        return getValueNative(getVkAddress());
    }

    public void setValue(long value) {
        setValueNative(getVkAddress(), value);
    }

    public static native long sizeof();
    protected static native long getValueNative(long vkaddress);
    protected static native void setValueNative(long vkaddress, long value);
    protected static native void loadNative(long vkaddress, long instance, long string);

    @Override
    public String toString() {
        return "0x" + Long.toHexString(getValue());
    }

    public static class Array extends VkFunctionPointer implements cz.mg.collections.array.ReadonlyArray<VkFunctionPointer> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFunctionPointer.sizeof()));
            this.count = count;
        }

        public Array(int count, VkFunctionPointer o){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkFunctionPointer get(int i){
            return new VkFunctionPointer(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }
}

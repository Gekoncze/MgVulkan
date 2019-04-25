package cz.mg.vulkan;

public class VkInt64 extends VkObject {
    public VkInt64() {
        super(sizeof());
    }

    protected VkInt64(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkInt64(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkInt64(VkPointer pointer) {
        super(pointer);
    }



    public VkInt64(long value) {
        super(sizeof());
        setValue(value);
    }

    public long getValue(){
        return getValueNative(getVkAddress());
    }

    public void setValue(long value){
        setValueNative(getVkAddress(), value);
    }

    public static native long sizeof();
    protected static native long getValueNative(long vkaddress);
    protected static native void setValueNative(long vkaddress, long value);

    @Override
    public String toString() {
        return "" + getValue();
    }

    public static class Array extends VkInt64 implements cz.mg.collections.array.ReadonlyArray<VkInt64> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkInt64.sizeof()));
            this.count = count;
        }

        public Array(VkInt64 o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
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
        public VkInt64 get(int i){
            return new VkInt64(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}

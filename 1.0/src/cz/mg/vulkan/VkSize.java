package cz.mg.vulkan;

public class VkSize extends VkObject {
    public VkSize() {
        super(sizeof());
    }

    protected VkSize(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSize(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSize(VkPointer pointer) {
        super(pointer);
    }



    public VkSize(long value) {
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

    public static class Array extends VkSize implements cz.mg.collections.array.ReadonlyArray<VkSize> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSize.sizeof()));
            this.count = count;
        }

        public Array(VkSize o, int count){
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





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkSize get(int i){
            return new VkSize(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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

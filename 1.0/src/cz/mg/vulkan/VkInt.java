package cz.mg.vulkan;

public class VkInt extends VkObject {
    public VkInt() {
        super(sizeof());
    }

    protected VkInt(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkInt(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkInt(VkPointer pointer) {
        super(pointer);
    }



    public VkInt(int value) {
        super(sizeof());
        setValue(value);
    }

    public int getValue(){
        return getValueNative(getVkAddress());
    }

    public void setValue(int value){
        setValueNative(getVkAddress(), value);
    }

    public void set(VkInt o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);
    protected static native int getValueNative(long vkaddress);
    protected static native void setValueNative(long vkaddress, int value);

    @Override
    public String toString() {
        return "" + getValue();
    }

    public static class Array extends VkInt implements cz.mg.collections.array.ReadonlyArray<VkInt> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkInt.sizeof()));
            this.count = count;
        }

        public Array(VkInt o, int count){
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

        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValue(i, values[i]);
        }

        public int getValue(int i){
            return getValueNative(address(i));
        }

        public void setValue(int i, int value){
            setValueNative(address(i), value);
        }



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkInt get(int i){
            return new VkInt(getVkMemory(), address(i));
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

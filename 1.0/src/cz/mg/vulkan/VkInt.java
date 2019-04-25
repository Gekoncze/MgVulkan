package cz.mg.vulkan;

public class VkInt extends VkObject {
    public VkInt() {
        super(sizeof());
    }

    public VkInt(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkInt(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

    public static native long sizeof();
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

        public Array(int count, VkInt o){
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

        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public int getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, int value){
            setValueNative(addressAt(i), value);
        }



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkInt get(int i){
            return new VkInt(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}

package cz.mg.vulkan;

public class VkDouble extends VkObject {
    public VkDouble() {
        super(sizeof());
    }

    public VkDouble(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDouble(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDouble(double value) {
        super(sizeof());
        setValue(value);
    }

    public double getValue(){
        return getValueNative(getVkAddress());
    }

    public void setValue(double value){
        setValueNative(getVkAddress(), value);
    }

    public static native long sizeof();
    protected static native double getValueNative(long vkaddress);
    protected static native void setValueNative(long vkaddress, double value);

    @Override
    public String toString() {
        return "" + getValue();
    }

    public static class Array extends VkDouble implements cz.mg.collections.array.ReadonlyArray<VkDouble> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDouble.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDouble o){
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

        public Array(double... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public double getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, double value){
            setValueNative(addressAt(i), value);
        }



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDouble get(int i){
            return new VkDouble(getVkMemory(), addressAt(i));
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

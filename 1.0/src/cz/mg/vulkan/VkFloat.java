package cz.mg.vulkan;

public class VkFloat extends VkObject {
    public VkFloat() {
        super(sizeof());
    }

    public VkFloat(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFloat(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkFloat(float value) {
        super(sizeof());
        setValue(value);
    }

    public float getValue(){
        return getValueNative(getVkAddress());
    }

    public void setValue(float value){
        setValueNative(getVkAddress(), value);
    }

    public static native long sizeof();
    protected static native float getValueNative(long vkaddress);
    protected static native void setValueNative(long vkaddress, float value);

    @Override
    public String toString() {
        return "" + getValue();
    }

    public static class Array extends VkFloat implements cz.mg.collections.array.ReadonlyArray<VkFloat> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFloat.sizeof()));
            this.count = count;
        }

        public Array(int count, VkFloat o){
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

        public Array(float... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public float getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, float value){
            setValueNative(addressAt(i), value);
        }



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkFloat get(int i){
            return new VkFloat(getVkMemory(), addressAt(i));
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

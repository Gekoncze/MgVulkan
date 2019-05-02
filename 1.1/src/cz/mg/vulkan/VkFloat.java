package cz.mg.vulkan;

public class VkFloat extends VkObject {
    public VkFloat() {
        super(sizeof());
    }

    protected VkFloat(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkFloat(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkFloat(VkPointer pointer) {
        super(pointer);
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

    public void set(VkFloat o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);
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

        public Array(VkFloat o, int count){
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

        public Array(float... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValue(i, values[i]);
        }

        public float getValue(int i){
            return getValueNative(address(i));
        }

        public void setValue(int i, float value){
            setValueNative(address(i), value);
        }



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkFloat get(int i){
            return new VkFloat(getVkMemory(), address(i));
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

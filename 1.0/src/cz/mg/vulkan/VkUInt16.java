package cz.mg.vulkan;

public class VkUInt16 extends VkObject {
    public VkUInt16() {
        super(sizeof());
    }

    protected VkUInt16(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkUInt16(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkUInt16(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt16(short value) {
        super(sizeof());
        setValue(value);
    }

    public short getValue(){
        return getValueNative(getVkAddress());
    }

    public void setValue(short value){
        setValueNative(getVkAddress(), value);
    }

    public void set(VkUInt16 o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);
    protected static native short getValueNative(long vkaddress);
    protected static native void setValueNative(long vkaddress, short value);

    @Override
    public String toString() {
        return "" + getValue();
    }

    public static class Array extends VkUInt16 implements cz.mg.collections.array.ReadonlyArray<VkUInt16> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkUInt16.sizeof()));
            this.count = count;
        }

        public Array(VkUInt16 o, int count){
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

        public Array(short... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValue(i, values[i]);
        }

        public short getValue(int i){
            return getValueNative(address(i));
        }

        public void setValue(int i, short value){
            setValueNative(address(i), value);
        }



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkUInt16 get(int i){
            return new VkUInt16(getVkMemory(), address(i));
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

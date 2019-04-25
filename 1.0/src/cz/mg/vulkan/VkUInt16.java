package cz.mg.vulkan;

public class VkUInt16 extends VkObject {
    public VkUInt16() {
        super(sizeof());
    }

    public VkUInt16(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkUInt16(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

    public static native long sizeof();
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

        public Array(int count, VkUInt16 o){
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

        public Array(short... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public short getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, short value){
            setValueNative(addressAt(i), value);
        }



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkUInt16 get(int i){
            return new VkUInt16(getVkMemory(), addressAt(i));
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

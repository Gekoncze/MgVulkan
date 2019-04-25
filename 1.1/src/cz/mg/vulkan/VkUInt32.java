package cz.mg.vulkan;

public class VkUInt32 extends VkObject {
    public VkUInt32() {
        super(sizeof());
    }

    protected VkUInt32(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkUInt32(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkUInt32(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32(int value) {
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

    public static class Array extends VkUInt32 implements cz.mg.collections.array.ReadonlyArray<VkUInt32> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkUInt32.sizeof()));
            this.count = count;
        }

        public Array(VkUInt32 o, int count){
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
        public VkUInt32 get(int i){
            return new VkUInt32(getVkMemory(), addressAt(i));
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

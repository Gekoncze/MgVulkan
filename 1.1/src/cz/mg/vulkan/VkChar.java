package cz.mg.vulkan;

public class VkChar extends VkObject {
    public VkChar() {
        super(sizeof());
    }

    protected VkChar(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkChar(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkChar(VkPointer pointer) {
        super(pointer);
    }



    public VkChar(byte value) {
        super(sizeof());
        setValue(value);
    }

    public byte getValue(){
        return getValueNative(getVkAddress());
    }

    public void setValue(byte value){
        setValueNative(getVkAddress(), value);
    }

    public static native long sizeof();
    protected static native byte getValueNative(long vkaddress);
    protected static native void setValueNative(long vkaddress, byte value);

    @Override
    public String toString() {
        return "" + getValue();
    }

    public static class Array extends VkChar implements cz.mg.collections.array.ReadonlyArray<VkChar> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkChar.sizeof()));
            this.count = count;
        }

        public Array(VkChar o, int count){
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

        public Array(byte... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public byte getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, byte value){
            setValueNative(addressAt(i), value);
        }



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkChar get(int i){
            return new VkChar(getVkMemory(), addressAt(i));
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

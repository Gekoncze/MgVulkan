package cz.mg.vulkan;

public class VkUInt8 extends VkObject {
    public VkUInt8() {
        super(sizeof());
    }

    protected VkUInt8(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkUInt8(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkUInt8(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt8(byte value) {
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

    public static class Array extends VkUInt8 implements cz.mg.collections.array.ReadonlyArray<VkUInt8> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkUInt8.sizeof()));
            this.count = count;
        }

        public Array(VkUInt8 o, int count){
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
            for(int i = 0; i < values.length; i++) setValue(i, values[i]);
        }

        public byte getValue(int i){
            return getValueNative(address(i));
        }

        public void setValue(int i, byte value){
            setValueNative(address(i), value);
        }



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkUInt8 get(int i){
            return new VkUInt8(getVkMemory(), address(i));
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

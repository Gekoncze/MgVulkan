package cz.mg.vulkan;

public class VkInt16 extends VkObject {
    public VkInt16() {
        super(sizeof());
    }

    public VkInt16(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkInt16(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkInt16(short value) {
        super(sizeof());
        setValue(value);
    }

    public short getValue(){
        return getValue(getVkAddress());
    }

    public void setValue(short value){
        setValue(getVkAddress(), value);
    }

    public static native long sizeof();
    protected static native short getValue(long vkaddress);
    protected static native void setValue(long vkaddress, short value);

    @Override
    public String toString() {
        return "" + getValue();
    }

    public static class Array extends VkInt16 implements cz.mg.collections.array.ReadonlyArray<VkInt16> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkInt16.sizeof()));
            this.count = count;
        }

        public Array(int count, VkInt16 o){
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
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i]);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkInt16 get(int i){
            return new VkInt16(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkInt16.Pointer implements cz.mg.collections.array.ReadonlyArray<VkInt16.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkInt16[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkInt16.Pointer get(int i){
                return new VkInt16.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

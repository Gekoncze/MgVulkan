package cz.mg.vulkan;

public class VkChar extends VkObject {
    public VkChar() {
        super(sizeof());
    }

    public VkChar(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkChar(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkChar(byte value) {
        super(sizeof());
        setValue(value);
    }

    public byte getValue(){
        return getValue(getVkAddress());
    }

    public void setValue(byte value){
        setValue(getVkAddress(), value);
    }

    public static native long sizeof();
    protected static native byte getValue(long vkaddress);
    protected static native void setValue(long vkaddress, byte value);

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

        public Array(int count, VkChar o){
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



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkChar get(int i){
            return new VkChar(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkChar.Pointer implements cz.mg.collections.array.ReadonlyArray<VkChar.Pointer> {
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

            public Array(VkChar[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkChar.Pointer get(int i){
                return new VkChar.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

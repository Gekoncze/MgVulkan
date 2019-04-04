package cz.mg.vulkan.vk;

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

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkUInt16 get(int i){
            return new VkUInt16(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkUInt16.Pointer implements cz.mg.collections.array.ReadonlyArray<VkUInt16.Pointer> {
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

            public Array(VkUInt16[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkUInt16.Pointer get(int i){
                return new VkUInt16.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

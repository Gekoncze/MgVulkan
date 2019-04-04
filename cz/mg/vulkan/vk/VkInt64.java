package cz.mg.vulkan.vk;

public class VkInt64 extends VkObject {
    public VkInt64() {
        super(sizeof());
    }

    public VkInt64(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkInt64(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkInt64(long value) {
        super(sizeof());
        setValue(value);
    }

    public long getValue(){
        return getValue(getVkAddress());
    }

    public void setValue(long value){
        setValue(getVkAddress(), value);
    }

    public static native long sizeof();
    protected static native long getValue(long vkaddress);
    protected static native void setValue(long vkaddress, long value);

    @Override
    public String toString() {
        return "" + getValue();
    }

    public static class Array extends VkInt64 implements cz.mg.collections.array.ReadonlyArray<VkInt64> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkInt64.sizeof()));
            this.count = count;
        }

        public Array(int count, VkInt64 o){
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
        public VkInt64 get(int i){
            return new VkInt64(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkInt64.Pointer implements cz.mg.collections.array.ReadonlyArray<VkInt64.Pointer> {
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

            public Array(VkInt64[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkInt64.Pointer get(int i){
                return new VkInt64.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

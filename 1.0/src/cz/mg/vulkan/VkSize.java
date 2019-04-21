package cz.mg.vulkan;

public class VkSize extends VkObject {
    public VkSize() {
        super(sizeof());
    }

    public VkSize(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSize(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSize(long value) {
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

    public static class Array extends VkSize implements cz.mg.collections.array.ReadonlyArray<VkSize> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSize.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSize o){
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
        public VkSize get(int i){
            return new VkSize(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSize.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSize.Pointer> {
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

            public Array(VkSize[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSize.Pointer get(int i){
                return new VkSize.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

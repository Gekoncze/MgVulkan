package cz.mg.vulkan;

public class VkFlagBits extends VkInt32 {
    public VkFlagBits() {
    }

    public VkFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkFlagBits(int value) {
        setValue(value);
    }

    public static class Array extends VkFlagBits implements cz.mg.collections.array.ReadonlyArray<VkFlagBits> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkFlagBits o){
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
        public VkFlagBits get(int i){
            return new VkFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VkFlagBits.Pointer> {
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

            public Array(VkFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkFlagBits.Pointer get(int i){
                return new VkFlagBits.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}

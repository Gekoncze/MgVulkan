package cz.mg.vulkan;

public class VkEnum extends VkInt32 {
    public VkEnum() {
    }

    public VkEnum(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkEnum(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkEnum(int value) {
        setValue(value);
    }

    public static class Array extends VkEnum implements cz.mg.collections.array.ReadonlyArray<VkEnum> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkEnum.sizeof()));
            this.count = count;
        }

        public Array(int count, VkEnum o){
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
        public VkEnum get(int i){
            return new VkEnum(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkEnum.Pointer implements cz.mg.collections.array.ReadonlyArray<VkEnum.Pointer> {
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

            public Array(VkEnum[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkEnum.Pointer get(int i){
                return new VkEnum.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

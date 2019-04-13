package cz.mg.vulkan;

public class VkDeviceSize extends VkUInt64 {
    public VkDeviceSize() {
    }

    public VkDeviceSize(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceSize(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDeviceSize(long value) {
        setValue(value);
    }

    public static class Array extends VkDeviceSize implements cz.mg.collections.array.ReadonlyArray<VkDeviceSize> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceSize.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceSize o){
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
        public VkDeviceSize get(int i){
            return new VkDeviceSize(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceSize.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceSize.Pointer> {
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

            public Array(VkDeviceSize[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceSize.Pointer get(int i){
                return new VkDeviceSize.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSharingMode.html">khronos documentation</a>
 **/
public class VkSharingMode extends VkEnum {
    public static final int VK_SHARING_MODE_EXCLUSIVE = 0;
    public static final int VK_SHARING_MODE_CONCURRENT = 1;

    public VkSharingMode() {
    }

    public VkSharingMode(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSharingMode(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSharingMode(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SHARING_MODE_EXCLUSIVE) return "VK_SHARING_MODE_EXCLUSIVE";
        if(getValue() == VK_SHARING_MODE_CONCURRENT) return "VK_SHARING_MODE_CONCURRENT";
        return "UNKNOWN";
    }

    public static class Array extends VkSharingMode implements cz.mg.collections.array.ReadonlyArray<VkSharingMode> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSharingMode.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSharingMode o){
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
        public VkSharingMode get(int i){
            return new VkSharingMode(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSharingMode.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSharingMode.Pointer> {
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

            public Array(VkSharingMode[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSharingMode.Pointer get(int i){
                return new VkSharingMode.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

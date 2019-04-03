package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceQueueCreateFlagBits.html">khronos documentation</a>
 **/
public class VkDeviceQueueCreateFlagBits extends VkFlagBits {
    public static final int VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT = 0x00000001;

    public VkDeviceQueueCreateFlagBits() {
    }

    public VkDeviceQueueCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceQueueCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDeviceQueueCreateFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT) s += "VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkDeviceQueueCreateFlagBits implements cz.mg.collections.array.ReadonlyArray<VkDeviceQueueCreateFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceQueueCreateFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceQueueCreateFlagBits o){
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
        public VkDeviceQueueCreateFlagBits get(int i){
            return new VkDeviceQueueCreateFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceQueueCreateFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkDeviceQueueCreateFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

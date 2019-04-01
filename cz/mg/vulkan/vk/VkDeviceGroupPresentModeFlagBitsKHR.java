package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceGroupPresentModeFlagBitsKHR.html">khronos documentation</a>
 **/
public class VkDeviceGroupPresentModeFlagBitsKHR extends VkFlagBits {
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR = 0x00000001;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR = 0x00000002;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR = 0x00000004;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR = 0x00000008;

    public VkDeviceGroupPresentModeFlagBitsKHR() {
    }

    public VkDeviceGroupPresentModeFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupPresentModeFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDeviceGroupPresentModeFlagBitsKHR(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR) s += "VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR ";
        if(getValue() == VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR) s += "VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR ";
        if(getValue() == VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR) s += "VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR ";
        if(getValue() == VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR) s += "VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkDeviceGroupPresentModeFlagBitsKHR implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupPresentModeFlagBitsKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupPresentModeFlagBitsKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceGroupPresentModeFlagBitsKHR o){
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
        public VkDeviceGroupPresentModeFlagBitsKHR get(int i){
            return new VkDeviceGroupPresentModeFlagBitsKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceGroupPresentModeFlagBitsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkDeviceGroupPresentModeFlagBitsKHR[] a) {
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

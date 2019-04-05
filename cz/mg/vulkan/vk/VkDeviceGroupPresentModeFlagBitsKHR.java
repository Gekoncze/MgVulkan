package cz.mg.vulkan.vk;

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
        if(getValue() == VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR) s += "VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR";
        if(getValue() == VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR) s += "VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR";
        if(getValue() == VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR) s += "VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR";
        if(getValue() == VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR) s += "VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

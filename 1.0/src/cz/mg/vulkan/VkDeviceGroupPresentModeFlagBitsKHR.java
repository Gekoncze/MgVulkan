package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkDeviceGroupPresentModeFlagBitsKHR extends VkFlagBits {
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR = 0x00000001;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR = 0x00000002;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR = 0x00000004;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR = 0x00000008;

    public VkDeviceGroupPresentModeFlagBitsKHR() {
    }

    protected VkDeviceGroupPresentModeFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDeviceGroupPresentModeFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceGroupPresentModeFlagBitsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkDeviceGroupPresentModeFlagBitsKHR(int value) {
        setValue(value);
    }

    public VkDeviceGroupPresentModeFlagBitsKHR(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR) != 0) s.addLast("VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR");
        if((getValue() & VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR) != 0) s.addLast("VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR");
        if((getValue() & VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR) != 0) s.addLast("VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR");
        if((getValue() & VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR) != 0) s.addLast("VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

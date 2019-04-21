package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkDeviceGroupPresentModeFlagBitsKHX extends VkFlagBits {
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX = 0x00000001;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHX = 0x00000002;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHX = 0x00000004;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX = 0x00000008;

    public VkDeviceGroupPresentModeFlagBitsKHX() {
    }

    public VkDeviceGroupPresentModeFlagBitsKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupPresentModeFlagBitsKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDeviceGroupPresentModeFlagBitsKHX(int value) {
        setValue(value);
    }

    public VkDeviceGroupPresentModeFlagBitsKHX(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX) != 0) s.addLast("VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX");
        if((getValue() & VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHX) != 0) s.addLast("VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHX");
        if((getValue() & VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHX) != 0) s.addLast("VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHX");
        if((getValue() & VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX) != 0) s.addLast("VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

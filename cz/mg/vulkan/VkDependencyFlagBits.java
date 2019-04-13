package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkDependencyFlagBits extends VkFlagBits {
    public static final int VK_DEPENDENCY_BY_REGION_BIT = 0x00000001;
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT = 0x00000004;
    public static final int VK_DEPENDENCY_VIEW_LOCAL_BIT = 0x00000002;
    public static final int VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR = VK_DEPENDENCY_VIEW_LOCAL_BIT;
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR = VK_DEPENDENCY_DEVICE_GROUP_BIT;

    public VkDependencyFlagBits() {
    }

    public VkDependencyFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDependencyFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDependencyFlagBits(int value) {
        setValue(value);
    }

    public VkDependencyFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_DEPENDENCY_BY_REGION_BIT) != 0) s.addLast("VK_DEPENDENCY_BY_REGION_BIT");
        if((getValue() & VK_DEPENDENCY_DEVICE_GROUP_BIT) != 0) s.addLast("VK_DEPENDENCY_DEVICE_GROUP_BIT");
        if((getValue() & VK_DEPENDENCY_VIEW_LOCAL_BIT) != 0) s.addLast("VK_DEPENDENCY_VIEW_LOCAL_BIT");
        if((getValue() & VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR) != 0) s.addLast("VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR");
        if((getValue() & VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR) != 0) s.addLast("VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

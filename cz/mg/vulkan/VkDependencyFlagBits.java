package cz.mg.vulkan;

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

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_DEPENDENCY_BY_REGION_BIT) s += "VK_DEPENDENCY_BY_REGION_BIT";
        if(getValue() == VK_DEPENDENCY_DEVICE_GROUP_BIT) s += "VK_DEPENDENCY_DEVICE_GROUP_BIT";
        if(getValue() == VK_DEPENDENCY_VIEW_LOCAL_BIT) s += "VK_DEPENDENCY_VIEW_LOCAL_BIT";
        if(getValue() == VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR) s += "VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR";
        if(getValue() == VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR) s += "VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

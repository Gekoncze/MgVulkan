package cz.mg.vulkan;

public class VkDebugUtilsMessageTypeFlagBitsEXT extends VkFlagBits {
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT = 0x00000001;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT = 0x00000002;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT = 0x00000004;

    public VkDebugUtilsMessageTypeFlagBitsEXT() {
    }

    public VkDebugUtilsMessageTypeFlagBitsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugUtilsMessageTypeFlagBitsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugUtilsMessageTypeFlagBitsEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT) s += "VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT";
        if(getValue() == VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT) s += "VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT";
        if(getValue() == VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT) s += "VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

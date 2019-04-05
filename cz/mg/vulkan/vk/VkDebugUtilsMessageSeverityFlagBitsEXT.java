package cz.mg.vulkan.vk;

public class VkDebugUtilsMessageSeverityFlagBitsEXT extends VkFlagBits {
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT = 0x00000001;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT = 0x00000010;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT = 0x00000100;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT = 0x00001000;

    public VkDebugUtilsMessageSeverityFlagBitsEXT() {
    }

    public VkDebugUtilsMessageSeverityFlagBitsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugUtilsMessageSeverityFlagBitsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugUtilsMessageSeverityFlagBitsEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT) s += "VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT";
        if(getValue() == VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT) s += "VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT";
        if(getValue() == VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT) s += "VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT";
        if(getValue() == VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT) s += "VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

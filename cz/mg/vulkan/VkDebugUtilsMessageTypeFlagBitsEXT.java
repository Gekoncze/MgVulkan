package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

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

    public VkDebugUtilsMessageTypeFlagBitsEXT(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT) != 0) s.addLast("VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT");
        if((getValue() & VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT) != 0) s.addLast("VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT");
        if((getValue() & VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT) != 0) s.addLast("VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

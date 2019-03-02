package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkDebugUtilsMessageTypeFlagsEXT;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanDebugUtilsMessageTypeFlagsEXT {
    public static final int GENERAL = VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT;
    public static final int VALIDATION = VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT;
    public static final int PERFORMANCE = VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT;

    public final VkDebugUtilsMessageTypeFlagsEXT flags;

    public VulkanDebugUtilsMessageTypeFlagsEXT() {
        this(0);
    }

    public VulkanDebugUtilsMessageTypeFlagsEXT(int flag){
        this(new VkDebugUtilsMessageTypeFlagsEXT(flag));
    }

    public VulkanDebugUtilsMessageTypeFlagsEXT(VkDebugUtilsMessageTypeFlagsEXT flags) {
        this.flags = flags;
    }

    public boolean isSet(int flag){
        return (flags.value & flag) != 0;
    }

    public void set(int flag){
        flags.value |= flag;
    }

    @Override
    public String toString() {
        return ToString.flagsToStringNoLabels(flags.value, VkDebugUtilsMessageTypeFlagsEXT.class);
    }
}

package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessageSeverityFlagBitsEXT.html">khronos documentation</a>
 **/
public class VulkanDebugUtilsMessageSeverityFlagBitsEXT extends VulkanFlagBits {
    public static final int DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_EXT = VkDebugUtilsMessageSeverityFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT;
    public static final int DEBUG_UTILS_MESSAGE_SEVERITY_INFO_EXT = VkDebugUtilsMessageSeverityFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT;
    public static final int DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_EXT = VkDebugUtilsMessageSeverityFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT;
    public static final int DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_EXT = VkDebugUtilsMessageSeverityFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT;

    public VulkanDebugUtilsMessageSeverityFlagBitsEXT(){
        super(new VkDebugUtilsMessageSeverityFlagBitsEXT());
    }

    public VulkanDebugUtilsMessageSeverityFlagBitsEXT(VkDebugUtilsMessageSeverityFlagBitsEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessageSeverityFlagBitsEXT getVk(){
        return (VkDebugUtilsMessageSeverityFlagBitsEXT) super.getVk();
    }

    public VulkanDebugUtilsMessageSeverityFlagBitsEXT(int value){
        super(new VkDebugUtilsMessageSeverityFlagBitsEXT(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_EXT) s += "DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_EXT";
        if(getValue() == DEBUG_UTILS_MESSAGE_SEVERITY_INFO_EXT) s += "DEBUG_UTILS_MESSAGE_SEVERITY_INFO_EXT";
        if(getValue() == DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_EXT) s += "DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_EXT";
        if(getValue() == DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_EXT) s += "DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

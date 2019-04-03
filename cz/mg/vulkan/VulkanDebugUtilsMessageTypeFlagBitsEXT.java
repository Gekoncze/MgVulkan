package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessageTypeFlagBitsEXT.html">khronos documentation</a>
 **/
public class VulkanDebugUtilsMessageTypeFlagBitsEXT extends VulkanFlagBits {
    public static final int DEBUG_UTILS_MESSAGE_TYPE_GENERAL_EXT = VkDebugUtilsMessageTypeFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT;
    public static final int DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_EXT = VkDebugUtilsMessageTypeFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT;
    public static final int DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_EXT = VkDebugUtilsMessageTypeFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT;

    public VulkanDebugUtilsMessageTypeFlagBitsEXT(){
        super(new VkDebugUtilsMessageTypeFlagBitsEXT());
    }

    public VulkanDebugUtilsMessageTypeFlagBitsEXT(VkDebugUtilsMessageTypeFlagBitsEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessageTypeFlagBitsEXT getVk(){
        return (VkDebugUtilsMessageTypeFlagBitsEXT) super.getVk();
    }

    public VulkanDebugUtilsMessageTypeFlagBitsEXT(int value){
        super(new VkDebugUtilsMessageTypeFlagBitsEXT(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEBUG_UTILS_MESSAGE_TYPE_GENERAL_EXT) s += "DEBUG_UTILS_MESSAGE_TYPE_GENERAL_EXT";
        if(getValue() == DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_EXT) s += "DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_EXT";
        if(getValue() == DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_EXT) s += "DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

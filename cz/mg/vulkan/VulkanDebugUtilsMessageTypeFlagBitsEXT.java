package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDebugUtilsMessageTypeFlagBitsEXT extends VulkanFlagBits {
    public static final int GENERAL_EXT = VkDebugUtilsMessageTypeFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT;
    public static final int VALIDATION_EXT = VkDebugUtilsMessageTypeFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT;
    public static final int PERFORMANCE_EXT = VkDebugUtilsMessageTypeFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT;

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
        if(getValue() == GENERAL_EXT) s += "GENERAL_EXT";
        if(getValue() == VALIDATION_EXT) s += "VALIDATION_EXT";
        if(getValue() == PERFORMANCE_EXT) s += "PERFORMANCE_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

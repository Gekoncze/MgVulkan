package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDebugUtilsMessageSeverityFlagsEXT extends VulkanFlags {
    public VulkanDebugUtilsMessageSeverityFlagsEXT(){
        super(new VkDebugUtilsMessageSeverityFlagsEXT());
    }

    public VulkanDebugUtilsMessageSeverityFlagsEXT(VkDebugUtilsMessageSeverityFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessageSeverityFlagsEXT getVk(){
        return (VkDebugUtilsMessageSeverityFlagsEXT) super.getVk();
    }

    public VulkanDebugUtilsMessageSeverityFlagsEXT(int value){
        super(new VkDebugUtilsMessageSeverityFlagsEXT(value));
    }
}

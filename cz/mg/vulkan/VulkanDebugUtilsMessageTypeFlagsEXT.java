package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDebugUtilsMessageTypeFlagsEXT extends VulkanFlags {
    public VulkanDebugUtilsMessageTypeFlagsEXT(){
        super(new VkDebugUtilsMessageTypeFlagsEXT());
    }

    public VulkanDebugUtilsMessageTypeFlagsEXT(VkDebugUtilsMessageTypeFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessageTypeFlagsEXT getVk(){
        return (VkDebugUtilsMessageTypeFlagsEXT) super.getVk();
    }

    public VulkanDebugUtilsMessageTypeFlagsEXT(int value){
        super(new VkDebugUtilsMessageTypeFlagsEXT(value));
    }
}

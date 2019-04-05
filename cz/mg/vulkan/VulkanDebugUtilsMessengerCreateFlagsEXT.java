package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDebugUtilsMessengerCreateFlagsEXT extends VulkanFlags {
    public VulkanDebugUtilsMessengerCreateFlagsEXT(){
        super(new VkDebugUtilsMessengerCreateFlagsEXT());
    }

    public VulkanDebugUtilsMessengerCreateFlagsEXT(VkDebugUtilsMessengerCreateFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessengerCreateFlagsEXT getVk(){
        return (VkDebugUtilsMessengerCreateFlagsEXT) super.getVk();
    }

    public VulkanDebugUtilsMessengerCreateFlagsEXT(int value){
        super(new VkDebugUtilsMessengerCreateFlagsEXT(value));
    }
}

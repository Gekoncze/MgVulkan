package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessengerCreateFlagsEXT.html">khronos documentation</a>
 **/
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

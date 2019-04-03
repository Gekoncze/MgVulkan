package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessengerEXT.html">khronos documentation</a>
 **/
public class VulkanDebugUtilsMessengerEXT extends VulkanHandle {
    public VulkanDebugUtilsMessengerEXT(){
        super(new VkDebugUtilsMessengerEXT());
    }

    public VulkanDebugUtilsMessengerEXT(VkDebugUtilsMessengerEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessengerEXT getVk(){
        return (VkDebugUtilsMessengerEXT) super.getVk();
    }

    public VulkanDebugUtilsMessengerEXT(int value){
        super(new VkDebugUtilsMessengerEXT(value));
    }
}

package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessengerCallbackDataFlagsEXT.html">khronos documentation</a>
 **/
public class VulkanDebugUtilsMessengerCallbackDataFlagsEXT extends VulkanFlags {
    public VulkanDebugUtilsMessengerCallbackDataFlagsEXT(){
        super(new VkDebugUtilsMessengerCallbackDataFlagsEXT());
    }

    public VulkanDebugUtilsMessengerCallbackDataFlagsEXT(VkDebugUtilsMessengerCallbackDataFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessengerCallbackDataFlagsEXT getVk(){
        return (VkDebugUtilsMessengerCallbackDataFlagsEXT) super.getVk();
    }

    public VulkanDebugUtilsMessengerCallbackDataFlagsEXT(int value){
        super(new VkDebugUtilsMessengerCallbackDataFlagsEXT(value));
    }
}

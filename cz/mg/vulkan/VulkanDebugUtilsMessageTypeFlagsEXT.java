package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessageTypeFlagsEXT.html">khronos documentation</a>
 **/
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

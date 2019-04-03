package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceMemory.html">khronos documentation</a>
 **/
public class VulkanDeviceMemory extends VulkanHandle {
    public VulkanDeviceMemory(){
        super(new VkDeviceMemory());
    }

    public VulkanDeviceMemory(VkDeviceMemory vk){
        super(vk);
    }

    @Override
    public VkDeviceMemory getVk(){
        return (VkDeviceMemory) super.getVk();
    }

    public VulkanDeviceMemory(int value){
        super(new VkDeviceMemory(value));
    }
}

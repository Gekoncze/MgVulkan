package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDevice.html">khronos documentation</a>
 **/
public class VulkanPhysicalDevice extends VulkanHandle {
    public VulkanPhysicalDevice(){
        super(new VkPhysicalDevice());
    }

    public VulkanPhysicalDevice(VkPhysicalDevice vk){
        super(vk);
    }

    @Override
    public VkPhysicalDevice getVk(){
        return (VkPhysicalDevice) super.getVk();
    }

    public VulkanPhysicalDevice(int value){
        super(new VkPhysicalDevice(value));
    }
}

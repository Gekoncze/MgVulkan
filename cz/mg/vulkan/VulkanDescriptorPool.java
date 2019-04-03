package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorPool.html">khronos documentation</a>
 **/
public class VulkanDescriptorPool extends VulkanHandle {
    public VulkanDescriptorPool(){
        super(new VkDescriptorPool());
    }

    public VulkanDescriptorPool(VkDescriptorPool vk){
        super(vk);
    }

    @Override
    public VkDescriptorPool getVk(){
        return (VkDescriptorPool) super.getVk();
    }

    public VulkanDescriptorPool(int value){
        super(new VkDescriptorPool(value));
    }
}

package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorSetLayout.html">khronos documentation</a>
 **/
public class VulkanDescriptorSetLayout extends VulkanHandle {
    public VulkanDescriptorSetLayout(){
        super(new VkDescriptorSetLayout());
    }

    public VulkanDescriptorSetLayout(VkDescriptorSetLayout vk){
        super(vk);
    }

    @Override
    public VkDescriptorSetLayout getVk(){
        return (VkDescriptorSetLayout) super.getVk();
    }

    public VulkanDescriptorSetLayout(int value){
        super(new VkDescriptorSetLayout(value));
    }
}

package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorSet.html">khronos documentation</a>
 **/
public class VulkanDescriptorSet extends VulkanHandle {
    public VulkanDescriptorSet(){
        super(new VkDescriptorSet());
    }

    public VulkanDescriptorSet(VkDescriptorSet vk){
        super(vk);
    }

    @Override
    public VkDescriptorSet getVk(){
        return (VkDescriptorSet) super.getVk();
    }

    public VulkanDescriptorSet(int value){
        super(new VkDescriptorSet(value));
    }
}

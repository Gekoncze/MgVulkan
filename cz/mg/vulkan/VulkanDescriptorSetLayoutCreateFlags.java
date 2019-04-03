package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorSetLayoutCreateFlags.html">khronos documentation</a>
 **/
public class VulkanDescriptorSetLayoutCreateFlags extends VulkanFlags {
    public VulkanDescriptorSetLayoutCreateFlags(){
        super(new VkDescriptorSetLayoutCreateFlags());
    }

    public VulkanDescriptorSetLayoutCreateFlags(VkDescriptorSetLayoutCreateFlags vk){
        super(vk);
    }

    @Override
    public VkDescriptorSetLayoutCreateFlags getVk(){
        return (VkDescriptorSetLayoutCreateFlags) super.getVk();
    }

    public VulkanDescriptorSetLayoutCreateFlags(int value){
        super(new VkDescriptorSetLayoutCreateFlags(value));
    }
}

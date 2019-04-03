package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorUpdateTemplate.html">khronos documentation</a>
 **/
public class VulkanDescriptorUpdateTemplate extends VulkanHandle {
    public VulkanDescriptorUpdateTemplate(){
        super(new VkDescriptorUpdateTemplate());
    }

    public VulkanDescriptorUpdateTemplate(VkDescriptorUpdateTemplate vk){
        super(vk);
    }

    @Override
    public VkDescriptorUpdateTemplate getVk(){
        return (VkDescriptorUpdateTemplate) super.getVk();
    }

    public VulkanDescriptorUpdateTemplate(int value){
        super(new VkDescriptorUpdateTemplate(value));
    }
}

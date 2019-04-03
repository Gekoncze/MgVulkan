package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorUpdateTemplateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanDescriptorUpdateTemplateCreateFlags extends VulkanFlags {
    public VulkanDescriptorUpdateTemplateCreateFlags(){
        super(new VkDescriptorUpdateTemplateCreateFlags());
    }

    public VulkanDescriptorUpdateTemplateCreateFlags(VkDescriptorUpdateTemplateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkDescriptorUpdateTemplateCreateFlags getVk(){
        return (VkDescriptorUpdateTemplateCreateFlags) super.getVk();
    }

    public VulkanDescriptorUpdateTemplateCreateFlags(int value){
        super(new VkDescriptorUpdateTemplateCreateFlags(value));
    }
}

package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

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

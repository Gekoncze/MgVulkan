package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorUpdateTemplateType.html">khronos documentation</a>
 **/
public class VulkanDescriptorUpdateTemplateType extends VulkanEnum {
    public static final int DESCRIPTOR_SET = VkDescriptorUpdateTemplateType.VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET;
    public static final int PUSH_DESCRIPTORS_KHR = VkDescriptorUpdateTemplateType.VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR;
    public static final int DESCRIPTOR_SET_KHR = VkDescriptorUpdateTemplateType.VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR;

    public VulkanDescriptorUpdateTemplateType(){
        super(new VkDescriptorUpdateTemplateType());
    }

    public VulkanDescriptorUpdateTemplateType(VkDescriptorUpdateTemplateType vk){
        super(vk);
    }

    @Override
    public VkDescriptorUpdateTemplateType getVk(){
        return (VkDescriptorUpdateTemplateType) super.getVk();
    }

    public VulkanDescriptorUpdateTemplateType(int value){
        super(new VkDescriptorUpdateTemplateType(value));
    }

    @Override
    public String toString() {
        if(getValue() == DESCRIPTOR_SET) return "DESCRIPTOR_SET";
        if(getValue() == PUSH_DESCRIPTORS_KHR) return "PUSH_DESCRIPTORS_KHR";
        if(getValue() == DESCRIPTOR_SET_KHR) return "DESCRIPTOR_SET_KHR";
        return "UNKNOWN";
    }
}

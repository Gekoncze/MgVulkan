package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorBindingFlagBitsEXT.html">khronos documentation</a>
 **/
public class VulkanDescriptorBindingFlagBitsEXT extends VulkanFlagBits {
    public static final int DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_EXT = VkDescriptorBindingFlagBitsEXT.VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT;
    public static final int DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_EXT = VkDescriptorBindingFlagBitsEXT.VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT;
    public static final int DESCRIPTOR_BINDING_PARTIALLY_BOUND_EXT = VkDescriptorBindingFlagBitsEXT.VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT;
    public static final int DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_EXT = VkDescriptorBindingFlagBitsEXT.VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT;

    public VulkanDescriptorBindingFlagBitsEXT(){
        super(new VkDescriptorBindingFlagBitsEXT());
    }

    public VulkanDescriptorBindingFlagBitsEXT(VkDescriptorBindingFlagBitsEXT vk){
        super(vk);
    }

    @Override
    public VkDescriptorBindingFlagBitsEXT getVk(){
        return (VkDescriptorBindingFlagBitsEXT) super.getVk();
    }

    public VulkanDescriptorBindingFlagBitsEXT(int value){
        super(new VkDescriptorBindingFlagBitsEXT(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_EXT) s += "DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_EXT";
        if(getValue() == DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_EXT) s += "DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_EXT";
        if(getValue() == DESCRIPTOR_BINDING_PARTIALLY_BOUND_EXT) s += "DESCRIPTOR_BINDING_PARTIALLY_BOUND_EXT";
        if(getValue() == DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_EXT) s += "DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

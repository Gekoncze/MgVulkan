package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDescriptorSetLayoutCreateFlagBits extends VulkanFlagBits {
    public static final int PUSH_DESCRIPTOR_KHR = VkDescriptorSetLayoutCreateFlagBits.VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR;
    public static final int UPDATE_AFTER_BIND_POOL_EXT = VkDescriptorSetLayoutCreateFlagBits.VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT;

    public VulkanDescriptorSetLayoutCreateFlagBits(){
        super(new VkDescriptorSetLayoutCreateFlagBits());
    }

    public VulkanDescriptorSetLayoutCreateFlagBits(VkDescriptorSetLayoutCreateFlagBits vk){
        super(vk);
    }

    @Override
    public VkDescriptorSetLayoutCreateFlagBits getVk(){
        return (VkDescriptorSetLayoutCreateFlagBits) super.getVk();
    }

    public VulkanDescriptorSetLayoutCreateFlagBits(int value){
        super(new VkDescriptorSetLayoutCreateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == PUSH_DESCRIPTOR_KHR) s += "PUSH_DESCRIPTOR_KHR";
        if(getValue() == UPDATE_AFTER_BIND_POOL_EXT) s += "UPDATE_AFTER_BIND_POOL_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

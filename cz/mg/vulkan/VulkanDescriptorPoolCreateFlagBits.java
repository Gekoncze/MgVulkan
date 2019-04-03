package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorPoolCreateFlagBits.html">khronos documentation</a>
 **/
public class VulkanDescriptorPoolCreateFlagBits extends VulkanFlagBits {
    public static final int FREE_DESCRIPTOR_SET = VkDescriptorPoolCreateFlagBits.VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT;
    public static final int UPDATE_AFTER_BIND_EXT = VkDescriptorPoolCreateFlagBits.VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT;

    public VulkanDescriptorPoolCreateFlagBits(){
        super(new VkDescriptorPoolCreateFlagBits());
    }

    public VulkanDescriptorPoolCreateFlagBits(VkDescriptorPoolCreateFlagBits vk){
        super(vk);
    }

    @Override
    public VkDescriptorPoolCreateFlagBits getVk(){
        return (VkDescriptorPoolCreateFlagBits) super.getVk();
    }

    public VulkanDescriptorPoolCreateFlagBits(int value){
        super(new VkDescriptorPoolCreateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == FREE_DESCRIPTOR_SET) s += "FREE_DESCRIPTOR_SET";
        if(getValue() == UPDATE_AFTER_BIND_EXT) s += "UPDATE_AFTER_BIND_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanBufferCreateFlagBits extends VulkanFlagBits {
    public static final int SPARSE_BINDING = VkBufferCreateFlagBits.VK_BUFFER_CREATE_SPARSE_BINDING_BIT;
    public static final int SPARSE_RESIDENCY = VkBufferCreateFlagBits.VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT;
    public static final int SPARSE_ALIASED = VkBufferCreateFlagBits.VK_BUFFER_CREATE_SPARSE_ALIASED_BIT;
    public static final int PROTECTED = VkBufferCreateFlagBits.VK_BUFFER_CREATE_PROTECTED_BIT;

    public VulkanBufferCreateFlagBits(){
        super(new VkBufferCreateFlagBits());
    }

    public VulkanBufferCreateFlagBits(VkBufferCreateFlagBits vk){
        super(vk);
    }

    @Override
    public VkBufferCreateFlagBits getVk(){
        return (VkBufferCreateFlagBits) super.getVk();
    }

    public VulkanBufferCreateFlagBits(int value){
        super(new VkBufferCreateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == SPARSE_BINDING) s += "SPARSE_BINDING";
        if(getValue() == SPARSE_RESIDENCY) s += "SPARSE_RESIDENCY";
        if(getValue() == SPARSE_ALIASED) s += "SPARSE_ALIASED";
        if(getValue() == PROTECTED) s += "PROTECTED";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAttachmentDescriptionFlagBits.html">khronos documentation</a>
 **/
public class VulkanAttachmentDescriptionFlagBits extends VulkanFlagBits {
    public static final int MAY_ALIAS = VkAttachmentDescriptionFlagBits.VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT;

    public VulkanAttachmentDescriptionFlagBits(){
        super(new VkAttachmentDescriptionFlagBits());
    }

    public VulkanAttachmentDescriptionFlagBits(VkAttachmentDescriptionFlagBits vk){
        super(vk);
    }

    @Override
    public VkAttachmentDescriptionFlagBits getVk(){
        return (VkAttachmentDescriptionFlagBits) super.getVk();
    }

    public VulkanAttachmentDescriptionFlagBits(int value){
        super(new VkAttachmentDescriptionFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == MAY_ALIAS) s += "MAY_ALIAS";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

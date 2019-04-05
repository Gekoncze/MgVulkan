package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanAttachmentDescriptionFlags extends VulkanFlags {
    public VulkanAttachmentDescriptionFlags(){
        super(new VkAttachmentDescriptionFlags());
    }

    public VulkanAttachmentDescriptionFlags(VkAttachmentDescriptionFlags vk){
        super(vk);
    }

    @Override
    public VkAttachmentDescriptionFlags getVk(){
        return (VkAttachmentDescriptionFlags) super.getVk();
    }

    public VulkanAttachmentDescriptionFlags(int value){
        super(new VkAttachmentDescriptionFlags(value));
    }
}

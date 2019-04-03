package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAttachmentDescriptionFlags.html">khronos documentation</a>
 **/
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

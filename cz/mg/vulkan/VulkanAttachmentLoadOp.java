package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAttachmentLoadOp.html">khronos documentation</a>
 **/
public class VulkanAttachmentLoadOp extends VulkanEnum {
    public static final int LOAD = VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_LOAD;
    public static final int CLEAR = VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_CLEAR;
    public static final int DONT_CARE = VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_DONT_CARE;

    public VulkanAttachmentLoadOp(){
        super(new VkAttachmentLoadOp());
    }

    public VulkanAttachmentLoadOp(VkAttachmentLoadOp vk){
        super(vk);
    }

    @Override
    public VkAttachmentLoadOp getVk(){
        return (VkAttachmentLoadOp) super.getVk();
    }

    public VulkanAttachmentLoadOp(int value){
        super(new VkAttachmentLoadOp(value));
    }

    @Override
    public String toString() {
        if(getValue() == LOAD) return "LOAD";
        if(getValue() == CLEAR) return "CLEAR";
        if(getValue() == DONT_CARE) return "DONT_CARE";
        return "UNKNOWN";
    }
}

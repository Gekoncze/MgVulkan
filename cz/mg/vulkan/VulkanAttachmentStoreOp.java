package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanAttachmentStoreOp extends VulkanEnum {
    public static final int STORE = VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_STORE;
    public static final int DONT_CARE = VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_DONT_CARE;

    public VulkanAttachmentStoreOp(){
        super(new VkAttachmentStoreOp());
    }

    public VulkanAttachmentStoreOp(VkAttachmentStoreOp vk){
        super(vk);
    }

    @Override
    public VkAttachmentStoreOp getVk(){
        return (VkAttachmentStoreOp) super.getVk();
    }

    public VulkanAttachmentStoreOp(int value){
        super(new VkAttachmentStoreOp(value));
    }

    @Override
    public String toString() {
        if(getValue() == STORE) return "STORE";
        if(getValue() == DONT_CARE) return "DONT_CARE";
        return "UNKNOWN";
    }
}

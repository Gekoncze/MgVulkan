package cz.mg.vulkan.vk;

public class VkAttachmentStoreOp extends VkEnum {
    public static final int VK_ATTACHMENT_STORE_OP_STORE = 0;
    public static final int VK_ATTACHMENT_STORE_OP_DONT_CARE = 1;

    public VkAttachmentStoreOp() {
    }

    public VkAttachmentStoreOp(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkAttachmentStoreOp(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkAttachmentStoreOp(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_ATTACHMENT_STORE_OP_STORE) return "VK_ATTACHMENT_STORE_OP_STORE";
        if(getValue() == VK_ATTACHMENT_STORE_OP_DONT_CARE) return "VK_ATTACHMENT_STORE_OP_DONT_CARE";
        return "UNKNOWN";
    }
}

package cz.mg.vulkan.vk;

public class VkAttachmentLoadOp extends VkEnum {
    public static final int VK_ATTACHMENT_LOAD_OP_LOAD = 0;
    public static final int VK_ATTACHMENT_LOAD_OP_CLEAR = 1;
    public static final int VK_ATTACHMENT_LOAD_OP_DONT_CARE = 2;

    public VkAttachmentLoadOp() {
    }

    public VkAttachmentLoadOp(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkAttachmentLoadOp(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkAttachmentLoadOp(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_ATTACHMENT_LOAD_OP_LOAD) return "VK_ATTACHMENT_LOAD_OP_LOAD";
        if(getValue() == VK_ATTACHMENT_LOAD_OP_CLEAR) return "VK_ATTACHMENT_LOAD_OP_CLEAR";
        if(getValue() == VK_ATTACHMENT_LOAD_OP_DONT_CARE) return "VK_ATTACHMENT_LOAD_OP_DONT_CARE";
        return "UNKNOWN";
    }
}

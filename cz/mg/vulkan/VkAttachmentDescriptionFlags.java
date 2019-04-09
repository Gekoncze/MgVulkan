package cz.mg.vulkan;

public class VkAttachmentDescriptionFlags extends VkFlags {
    public VkAttachmentDescriptionFlags() {
    }

    public VkAttachmentDescriptionFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkAttachmentDescriptionFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkAttachmentDescriptionFlags(int value) {
        setValue(value);
    }
}

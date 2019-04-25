package cz.mg.vulkan;

public class VkAttachmentDescriptionFlags extends VkFlags {
    public VkAttachmentDescriptionFlags() {
    }

    protected VkAttachmentDescriptionFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkAttachmentDescriptionFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkAttachmentDescriptionFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkAttachmentDescriptionFlags(int value) {
        setValue(value);
    }
}

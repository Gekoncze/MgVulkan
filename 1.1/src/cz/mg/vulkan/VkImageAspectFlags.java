package cz.mg.vulkan;

public class VkImageAspectFlags extends VkFlags {
    public VkImageAspectFlags() {
    }

    protected VkImageAspectFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkImageAspectFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageAspectFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkImageAspectFlags(int value) {
        setValue(value);
    }
}

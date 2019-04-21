package cz.mg.vulkan;

public class VkImageAspectFlags extends VkFlags {
    public VkImageAspectFlags() {
    }

    public VkImageAspectFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageAspectFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkImageAspectFlags(int value) {
        setValue(value);
    }
}

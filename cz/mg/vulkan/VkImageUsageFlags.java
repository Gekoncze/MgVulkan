package cz.mg.vulkan;

public class VkImageUsageFlags extends VkFlags {
    public VkImageUsageFlags() {
    }

    public VkImageUsageFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageUsageFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageUsageFlags(int value) {
        setValue(value);
    }
}

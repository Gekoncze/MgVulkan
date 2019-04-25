package cz.mg.vulkan;

public class VkImageUsageFlags extends VkFlags {
    public VkImageUsageFlags() {
    }

    protected VkImageUsageFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkImageUsageFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageUsageFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkImageUsageFlags(int value) {
        setValue(value);
    }
}

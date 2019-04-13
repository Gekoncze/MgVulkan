package cz.mg.vulkan;

public class VkCommandBufferUsageFlags extends VkFlags {
    public VkCommandBufferUsageFlags() {
    }

    public VkCommandBufferUsageFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandBufferUsageFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkCommandBufferUsageFlags(int value) {
        setValue(value);
    }
}

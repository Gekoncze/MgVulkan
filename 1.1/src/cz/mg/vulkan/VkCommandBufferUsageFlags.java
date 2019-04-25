package cz.mg.vulkan;

public class VkCommandBufferUsageFlags extends VkFlags {
    public VkCommandBufferUsageFlags() {
    }

    protected VkCommandBufferUsageFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkCommandBufferUsageFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCommandBufferUsageFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkCommandBufferUsageFlags(int value) {
        setValue(value);
    }
}

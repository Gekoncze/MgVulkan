package cz.mg.vulkan;

public class VkCommandBufferResetFlags extends VkFlags {
    public VkCommandBufferResetFlags() {
    }

    protected VkCommandBufferResetFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkCommandBufferResetFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCommandBufferResetFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkCommandBufferResetFlags(int value) {
        setValue(value);
    }
}

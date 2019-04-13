package cz.mg.vulkan;

public class VkCommandBufferResetFlags extends VkFlags {
    public VkCommandBufferResetFlags() {
    }

    public VkCommandBufferResetFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandBufferResetFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkCommandBufferResetFlags(int value) {
        setValue(value);
    }
}

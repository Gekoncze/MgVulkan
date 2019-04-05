package cz.mg.vulkan.vk;

public class VkCommandPoolResetFlags extends VkFlags {
    public VkCommandPoolResetFlags() {
    }

    public VkCommandPoolResetFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandPoolResetFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCommandPoolResetFlags(int value) {
        setValue(value);
    }
}

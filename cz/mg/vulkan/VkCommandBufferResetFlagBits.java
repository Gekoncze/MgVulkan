package cz.mg.vulkan;

public class VkCommandBufferResetFlagBits extends VkFlagBits {
    public static final int VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = 0x00000001;

    public VkCommandBufferResetFlagBits() {
    }

    public VkCommandBufferResetFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandBufferResetFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCommandBufferResetFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT) s += "VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

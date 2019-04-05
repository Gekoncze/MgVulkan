package cz.mg.vulkan.vk;

public class VkCommandPoolResetFlagBits extends VkFlagBits {
    public static final int VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = 0x00000001;

    public VkCommandPoolResetFlagBits() {
    }

    public VkCommandPoolResetFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandPoolResetFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCommandPoolResetFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT) s += "VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

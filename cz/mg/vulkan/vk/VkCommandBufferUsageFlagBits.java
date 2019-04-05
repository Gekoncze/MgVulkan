package cz.mg.vulkan.vk;

public class VkCommandBufferUsageFlagBits extends VkFlagBits {
    public static final int VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT = 0x00000001;
    public static final int VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT = 0x00000002;
    public static final int VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT = 0x00000004;

    public VkCommandBufferUsageFlagBits() {
    }

    public VkCommandBufferUsageFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandBufferUsageFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCommandBufferUsageFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT) s += "VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT";
        if(getValue() == VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT) s += "VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT";
        if(getValue() == VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT) s += "VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

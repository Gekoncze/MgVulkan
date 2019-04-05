package cz.mg.vulkan.vk;

public class VkCommandBufferLevel extends VkEnum {
    public static final int VK_COMMAND_BUFFER_LEVEL_PRIMARY = 0;
    public static final int VK_COMMAND_BUFFER_LEVEL_SECONDARY = 1;

    public VkCommandBufferLevel() {
    }

    public VkCommandBufferLevel(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandBufferLevel(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCommandBufferLevel(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_COMMAND_BUFFER_LEVEL_PRIMARY) return "VK_COMMAND_BUFFER_LEVEL_PRIMARY";
        if(getValue() == VK_COMMAND_BUFFER_LEVEL_SECONDARY) return "VK_COMMAND_BUFFER_LEVEL_SECONDARY";
        return "UNKNOWN";
    }
}

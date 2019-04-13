package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

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

    public VkCommandBufferResetFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT) != 0) s.addLast("VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

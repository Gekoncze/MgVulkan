package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkCommandPoolResetFlagBits extends VkFlagBits {
    public static final int VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = 0x00000001;

    public VkCommandPoolResetFlagBits() {
    }

    protected VkCommandPoolResetFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkCommandPoolResetFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCommandPoolResetFlagBits(VkPointer pointer) {
        super(pointer);
    }



    public VkCommandPoolResetFlagBits(int value) {
        setValue(value);
    }

    public VkCommandPoolResetFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT) != 0) s.addLast("VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

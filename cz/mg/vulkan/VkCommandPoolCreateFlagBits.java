package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkCommandPoolCreateFlagBits extends VkFlagBits {
    public static final int VK_COMMAND_POOL_CREATE_TRANSIENT_BIT = 0x00000001;
    public static final int VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT = 0x00000002;
    public static final int VK_COMMAND_POOL_CREATE_PROTECTED_BIT = 0x00000004;

    public VkCommandPoolCreateFlagBits() {
    }

    public VkCommandPoolCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandPoolCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCommandPoolCreateFlagBits(int value) {
        setValue(value);
    }

    public VkCommandPoolCreateFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_COMMAND_POOL_CREATE_TRANSIENT_BIT) != 0) s.addLast("VK_COMMAND_POOL_CREATE_TRANSIENT_BIT");
        if((getValue() & VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT) != 0) s.addLast("VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT");
        if((getValue() & VK_COMMAND_POOL_CREATE_PROTECTED_BIT) != 0) s.addLast("VK_COMMAND_POOL_CREATE_PROTECTED_BIT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

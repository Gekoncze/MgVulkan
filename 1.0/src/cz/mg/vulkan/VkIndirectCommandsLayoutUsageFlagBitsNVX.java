package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkIndirectCommandsLayoutUsageFlagBitsNVX extends VkFlagBits {
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX = 0x00000001;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_BIT_NVX = 0x00000002;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_BIT_NVX = 0x00000004;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX = 0x00000008;

    public VkIndirectCommandsLayoutUsageFlagBitsNVX() {
    }

    public VkIndirectCommandsLayoutUsageFlagBitsNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkIndirectCommandsLayoutUsageFlagBitsNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkIndirectCommandsLayoutUsageFlagBitsNVX(int value) {
        setValue(value);
    }

    public VkIndirectCommandsLayoutUsageFlagBitsNVX(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX) != 0) s.addLast("VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX");
        if((getValue() & VK_INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_BIT_NVX) != 0) s.addLast("VK_INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_BIT_NVX");
        if((getValue() & VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_BIT_NVX) != 0) s.addLast("VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_BIT_NVX");
        if((getValue() & VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX) != 0) s.addLast("VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

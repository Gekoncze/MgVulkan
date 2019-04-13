package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkQueryResultFlagBits extends VkFlagBits {
    public static final int VK_QUERY_RESULT_64_BIT = 0x00000001;
    public static final int VK_QUERY_RESULT_WAIT_BIT = 0x00000002;
    public static final int VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = 0x00000004;
    public static final int VK_QUERY_RESULT_PARTIAL_BIT = 0x00000008;

    public VkQueryResultFlagBits() {
    }

    public VkQueryResultFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueryResultFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkQueryResultFlagBits(int value) {
        setValue(value);
    }

    public VkQueryResultFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_QUERY_RESULT_64_BIT) != 0) s.addLast("VK_QUERY_RESULT_64_BIT");
        if((getValue() & VK_QUERY_RESULT_WAIT_BIT) != 0) s.addLast("VK_QUERY_RESULT_WAIT_BIT");
        if((getValue() & VK_QUERY_RESULT_WITH_AVAILABILITY_BIT) != 0) s.addLast("VK_QUERY_RESULT_WITH_AVAILABILITY_BIT");
        if((getValue() & VK_QUERY_RESULT_PARTIAL_BIT) != 0) s.addLast("VK_QUERY_RESULT_PARTIAL_BIT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

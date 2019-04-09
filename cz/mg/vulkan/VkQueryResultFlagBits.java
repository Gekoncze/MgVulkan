package cz.mg.vulkan;

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

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_QUERY_RESULT_64_BIT) s += "VK_QUERY_RESULT_64_BIT";
        if(getValue() == VK_QUERY_RESULT_WAIT_BIT) s += "VK_QUERY_RESULT_WAIT_BIT";
        if(getValue() == VK_QUERY_RESULT_WITH_AVAILABILITY_BIT) s += "VK_QUERY_RESULT_WITH_AVAILABILITY_BIT";
        if(getValue() == VK_QUERY_RESULT_PARTIAL_BIT) s += "VK_QUERY_RESULT_PARTIAL_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

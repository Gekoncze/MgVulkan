package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkSampleCountFlagBits extends VkFlagBits {
    public static final int VK_SAMPLE_COUNT_1_BIT = 0x00000001;
    public static final int VK_SAMPLE_COUNT_2_BIT = 0x00000002;
    public static final int VK_SAMPLE_COUNT_4_BIT = 0x00000004;
    public static final int VK_SAMPLE_COUNT_8_BIT = 0x00000008;
    public static final int VK_SAMPLE_COUNT_16_BIT = 0x00000010;
    public static final int VK_SAMPLE_COUNT_32_BIT = 0x00000020;
    public static final int VK_SAMPLE_COUNT_64_BIT = 0x00000040;

    public VkSampleCountFlagBits() {
    }

    protected VkSampleCountFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSampleCountFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSampleCountFlagBits(VkPointer pointer) {
        super(pointer);
    }



    public VkSampleCountFlagBits(int value) {
        setValue(value);
    }

    public VkSampleCountFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_SAMPLE_COUNT_1_BIT) != 0) s.addLast("VK_SAMPLE_COUNT_1_BIT");
        if((getValue() & VK_SAMPLE_COUNT_2_BIT) != 0) s.addLast("VK_SAMPLE_COUNT_2_BIT");
        if((getValue() & VK_SAMPLE_COUNT_4_BIT) != 0) s.addLast("VK_SAMPLE_COUNT_4_BIT");
        if((getValue() & VK_SAMPLE_COUNT_8_BIT) != 0) s.addLast("VK_SAMPLE_COUNT_8_BIT");
        if((getValue() & VK_SAMPLE_COUNT_16_BIT) != 0) s.addLast("VK_SAMPLE_COUNT_16_BIT");
        if((getValue() & VK_SAMPLE_COUNT_32_BIT) != 0) s.addLast("VK_SAMPLE_COUNT_32_BIT");
        if((getValue() & VK_SAMPLE_COUNT_64_BIT) != 0) s.addLast("VK_SAMPLE_COUNT_64_BIT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

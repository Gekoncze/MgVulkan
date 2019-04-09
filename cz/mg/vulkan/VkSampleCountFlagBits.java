package cz.mg.vulkan;

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

    public VkSampleCountFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSampleCountFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSampleCountFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_SAMPLE_COUNT_1_BIT) s += "VK_SAMPLE_COUNT_1_BIT";
        if(getValue() == VK_SAMPLE_COUNT_2_BIT) s += "VK_SAMPLE_COUNT_2_BIT";
        if(getValue() == VK_SAMPLE_COUNT_4_BIT) s += "VK_SAMPLE_COUNT_4_BIT";
        if(getValue() == VK_SAMPLE_COUNT_8_BIT) s += "VK_SAMPLE_COUNT_8_BIT";
        if(getValue() == VK_SAMPLE_COUNT_16_BIT) s += "VK_SAMPLE_COUNT_16_BIT";
        if(getValue() == VK_SAMPLE_COUNT_32_BIT) s += "VK_SAMPLE_COUNT_32_BIT";
        if(getValue() == VK_SAMPLE_COUNT_64_BIT) s += "VK_SAMPLE_COUNT_64_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

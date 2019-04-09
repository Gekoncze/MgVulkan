package cz.mg.vulkan;

public class VkSubgroupFeatureFlagBits extends VkFlagBits {
    public static final int VK_SUBGROUP_FEATURE_BASIC_BIT = 0x00000001;
    public static final int VK_SUBGROUP_FEATURE_VOTE_BIT = 0x00000002;
    public static final int VK_SUBGROUP_FEATURE_ARITHMETIC_BIT = 0x00000004;
    public static final int VK_SUBGROUP_FEATURE_BALLOT_BIT = 0x00000008;
    public static final int VK_SUBGROUP_FEATURE_SHUFFLE_BIT = 0x00000010;
    public static final int VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT = 0x00000020;
    public static final int VK_SUBGROUP_FEATURE_CLUSTERED_BIT = 0x00000040;
    public static final int VK_SUBGROUP_FEATURE_QUAD_BIT = 0x00000080;
    public static final int VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV = 0x00000100;

    public VkSubgroupFeatureFlagBits() {
    }

    public VkSubgroupFeatureFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSubgroupFeatureFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSubgroupFeatureFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_SUBGROUP_FEATURE_BASIC_BIT) s += "VK_SUBGROUP_FEATURE_BASIC_BIT";
        if(getValue() == VK_SUBGROUP_FEATURE_VOTE_BIT) s += "VK_SUBGROUP_FEATURE_VOTE_BIT";
        if(getValue() == VK_SUBGROUP_FEATURE_ARITHMETIC_BIT) s += "VK_SUBGROUP_FEATURE_ARITHMETIC_BIT";
        if(getValue() == VK_SUBGROUP_FEATURE_BALLOT_BIT) s += "VK_SUBGROUP_FEATURE_BALLOT_BIT";
        if(getValue() == VK_SUBGROUP_FEATURE_SHUFFLE_BIT) s += "VK_SUBGROUP_FEATURE_SHUFFLE_BIT";
        if(getValue() == VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT) s += "VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT";
        if(getValue() == VK_SUBGROUP_FEATURE_CLUSTERED_BIT) s += "VK_SUBGROUP_FEATURE_CLUSTERED_BIT";
        if(getValue() == VK_SUBGROUP_FEATURE_QUAD_BIT) s += "VK_SUBGROUP_FEATURE_QUAD_BIT";
        if(getValue() == VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV) s += "VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

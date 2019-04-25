package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

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

    protected VkSubgroupFeatureFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSubgroupFeatureFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSubgroupFeatureFlagBits(VkPointer pointer) {
        super(pointer);
    }



    public VkSubgroupFeatureFlagBits(int value) {
        setValue(value);
    }

    public VkSubgroupFeatureFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_SUBGROUP_FEATURE_BASIC_BIT) != 0) s.addLast("VK_SUBGROUP_FEATURE_BASIC_BIT");
        if((getValue() & VK_SUBGROUP_FEATURE_VOTE_BIT) != 0) s.addLast("VK_SUBGROUP_FEATURE_VOTE_BIT");
        if((getValue() & VK_SUBGROUP_FEATURE_ARITHMETIC_BIT) != 0) s.addLast("VK_SUBGROUP_FEATURE_ARITHMETIC_BIT");
        if((getValue() & VK_SUBGROUP_FEATURE_BALLOT_BIT) != 0) s.addLast("VK_SUBGROUP_FEATURE_BALLOT_BIT");
        if((getValue() & VK_SUBGROUP_FEATURE_SHUFFLE_BIT) != 0) s.addLast("VK_SUBGROUP_FEATURE_SHUFFLE_BIT");
        if((getValue() & VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT) != 0) s.addLast("VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT");
        if((getValue() & VK_SUBGROUP_FEATURE_CLUSTERED_BIT) != 0) s.addLast("VK_SUBGROUP_FEATURE_CLUSTERED_BIT");
        if((getValue() & VK_SUBGROUP_FEATURE_QUAD_BIT) != 0) s.addLast("VK_SUBGROUP_FEATURE_QUAD_BIT");
        if((getValue() & VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV) != 0) s.addLast("VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

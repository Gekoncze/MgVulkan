package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSubgroupFeatureFlagBits extends VulkanFlagBits {
    public static final int BASIC = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_BASIC_BIT;
    public static final int VOTE = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_VOTE_BIT;
    public static final int ARITHMETIC = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_ARITHMETIC_BIT;
    public static final int BALLOT = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_BALLOT_BIT;
    public static final int SHUFFLE = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_SHUFFLE_BIT;
    public static final int SHUFFLE_RELATIVE = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT;
    public static final int CLUSTERED = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_CLUSTERED_BIT;
    public static final int QUAD = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_QUAD_BIT;
    public static final int PARTITIONED_NV = VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV;

    public VulkanSubgroupFeatureFlagBits(){
        super(new VkSubgroupFeatureFlagBits());
    }

    public VulkanSubgroupFeatureFlagBits(VkSubgroupFeatureFlagBits vk){
        super(vk);
    }

    @Override
    public VkSubgroupFeatureFlagBits getVk(){
        return (VkSubgroupFeatureFlagBits) super.getVk();
    }

    public VulkanSubgroupFeatureFlagBits(int value){
        super(new VkSubgroupFeatureFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == BASIC) s += "BASIC";
        if(getValue() == VOTE) s += "VOTE";
        if(getValue() == ARITHMETIC) s += "ARITHMETIC";
        if(getValue() == BALLOT) s += "BALLOT";
        if(getValue() == SHUFFLE) s += "SHUFFLE";
        if(getValue() == SHUFFLE_RELATIVE) s += "SHUFFLE_RELATIVE";
        if(getValue() == CLUSTERED) s += "CLUSTERED";
        if(getValue() == QUAD) s += "QUAD";
        if(getValue() == PARTITIONED_NV) s += "PARTITIONED_NV";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

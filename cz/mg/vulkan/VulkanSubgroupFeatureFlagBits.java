package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSubgroupFeatureFlagBits.html">khronos documentation</a>
 **/
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

    public static class Array extends VulkanSubgroupFeatureFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanSubgroupFeatureFlagBits> {
        public Array(VkSubgroupFeatureFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSubgroupFeatureFlagBits.Array(count));
        }

        public Array(int count, VulkanSubgroupFeatureFlagBits o){
            this(new VkSubgroupFeatureFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkSubgroupFeatureFlagBits.Array getVk(){
            return (VkSubgroupFeatureFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSubgroupFeatureFlagBits get(int i){
            return new VulkanSubgroupFeatureFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSubgroupFeatureFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSubgroupFeatureFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkSubgroupFeatureFlagBits.Pointer(value));
        }

        @Override
        public VkSubgroupFeatureFlagBits.Pointer getVk(){
            return (VkSubgroupFeatureFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanSubgroupFeatureFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSubgroupFeatureFlagBits.Pointer> {
            public Array(int count) {
                super(new VkSubgroupFeatureFlagBits.Pointer.Array(count));
            }

            public Array(VulkanSubgroupFeatureFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSubgroupFeatureFlagBits.Pointer.Array getVk(){
                return (VkSubgroupFeatureFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSubgroupFeatureFlagBits.Pointer get(int i){
                return new VulkanSubgroupFeatureFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}

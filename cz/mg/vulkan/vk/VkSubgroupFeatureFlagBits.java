package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSubgroupFeatureFlagBits.html">khronos documentation</a>
 **/
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
        if(getValue() == VK_SUBGROUP_FEATURE_BASIC_BIT) s += "VK_SUBGROUP_FEATURE_BASIC_BIT ";
        if(getValue() == VK_SUBGROUP_FEATURE_VOTE_BIT) s += "VK_SUBGROUP_FEATURE_VOTE_BIT ";
        if(getValue() == VK_SUBGROUP_FEATURE_ARITHMETIC_BIT) s += "VK_SUBGROUP_FEATURE_ARITHMETIC_BIT ";
        if(getValue() == VK_SUBGROUP_FEATURE_BALLOT_BIT) s += "VK_SUBGROUP_FEATURE_BALLOT_BIT ";
        if(getValue() == VK_SUBGROUP_FEATURE_SHUFFLE_BIT) s += "VK_SUBGROUP_FEATURE_SHUFFLE_BIT ";
        if(getValue() == VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT) s += "VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT ";
        if(getValue() == VK_SUBGROUP_FEATURE_CLUSTERED_BIT) s += "VK_SUBGROUP_FEATURE_CLUSTERED_BIT ";
        if(getValue() == VK_SUBGROUP_FEATURE_QUAD_BIT) s += "VK_SUBGROUP_FEATURE_QUAD_BIT ";
        if(getValue() == VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV) s += "VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkSubgroupFeatureFlagBits implements cz.mg.collections.array.ReadonlyArray<VkSubgroupFeatureFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSubgroupFeatureFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSubgroupFeatureFlagBits o){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkSubgroupFeatureFlagBits get(int i){
            return new VkSubgroupFeatureFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkSubgroupFeatureFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
                this.count = count;
            }

            public Array(VkMemory vkmemory, int count) {
                super(vkmemory);
                this.count = count;
            }

            public Array(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress);
                this.count = count;
            }

            public Array(VkSubgroupFeatureFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

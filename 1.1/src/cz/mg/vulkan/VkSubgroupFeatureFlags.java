package cz.mg.vulkan;

public class VkSubgroupFeatureFlags extends VkFlags {
    public VkSubgroupFeatureFlags() {
    }

    public VkSubgroupFeatureFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSubgroupFeatureFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSubgroupFeatureFlags(int value) {
        setValue(value);
    }
}

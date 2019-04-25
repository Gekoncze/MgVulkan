package cz.mg.vulkan;

public class VkSubgroupFeatureFlags extends VkFlags {
    public VkSubgroupFeatureFlags() {
    }

    protected VkSubgroupFeatureFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSubgroupFeatureFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSubgroupFeatureFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkSubgroupFeatureFlags(int value) {
        setValue(value);
    }
}

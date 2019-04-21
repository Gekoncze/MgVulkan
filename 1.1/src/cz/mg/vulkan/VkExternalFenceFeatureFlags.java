package cz.mg.vulkan;

public class VkExternalFenceFeatureFlags extends VkFlags {
    public VkExternalFenceFeatureFlags() {
    }

    public VkExternalFenceFeatureFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalFenceFeatureFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkExternalFenceFeatureFlags(int value) {
        setValue(value);
    }
}

package cz.mg.vulkan;

public class VkExternalMemoryFeatureFlags extends VkFlags {
    public VkExternalMemoryFeatureFlags() {
    }

    public VkExternalMemoryFeatureFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalMemoryFeatureFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkExternalMemoryFeatureFlags(int value) {
        setValue(value);
    }
}

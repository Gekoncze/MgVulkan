package cz.mg.vulkan.vk;

public class VkExternalSemaphoreFeatureFlags extends VkFlags {
    public VkExternalSemaphoreFeatureFlags() {
    }

    public VkExternalSemaphoreFeatureFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalSemaphoreFeatureFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkExternalSemaphoreFeatureFlags(int value) {
        setValue(value);
    }
}

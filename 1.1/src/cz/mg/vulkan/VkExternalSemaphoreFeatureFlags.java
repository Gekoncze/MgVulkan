package cz.mg.vulkan;

public class VkExternalSemaphoreFeatureFlags extends VkFlags {
    public VkExternalSemaphoreFeatureFlags() {
    }

    protected VkExternalSemaphoreFeatureFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalSemaphoreFeatureFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalSemaphoreFeatureFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalSemaphoreFeatureFlags(int value) {
        setValue(value);
    }
}

package cz.mg.vulkan;

public class VkExternalSemaphoreFeatureFlagsKHR extends VkFlags {
    public VkExternalSemaphoreFeatureFlagsKHR() {
    }

    protected VkExternalSemaphoreFeatureFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalSemaphoreFeatureFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalSemaphoreFeatureFlagsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalSemaphoreFeatureFlagsKHR(int value) {
        setValue(value);
    }
}

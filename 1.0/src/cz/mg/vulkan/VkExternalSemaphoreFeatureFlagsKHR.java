package cz.mg.vulkan;

public class VkExternalSemaphoreFeatureFlagsKHR extends VkFlags {
    public VkExternalSemaphoreFeatureFlagsKHR() {
    }

    public VkExternalSemaphoreFeatureFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalSemaphoreFeatureFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkExternalSemaphoreFeatureFlagsKHR(int value) {
        setValue(value);
    }
}

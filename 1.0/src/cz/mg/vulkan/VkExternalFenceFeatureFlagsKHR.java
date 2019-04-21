package cz.mg.vulkan;

public class VkExternalFenceFeatureFlagsKHR extends VkFlags {
    public VkExternalFenceFeatureFlagsKHR() {
    }

    public VkExternalFenceFeatureFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalFenceFeatureFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkExternalFenceFeatureFlagsKHR(int value) {
        setValue(value);
    }
}

package cz.mg.vulkan;

public class VkExternalFenceFeatureFlagsKHR extends VkFlags {
    public VkExternalFenceFeatureFlagsKHR() {
    }

    protected VkExternalFenceFeatureFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalFenceFeatureFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalFenceFeatureFlagsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalFenceFeatureFlagsKHR(int value) {
        setValue(value);
    }
}

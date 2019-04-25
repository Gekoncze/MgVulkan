package cz.mg.vulkan;

public class VkExternalMemoryFeatureFlagsKHR extends VkFlags {
    public VkExternalMemoryFeatureFlagsKHR() {
    }

    protected VkExternalMemoryFeatureFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalMemoryFeatureFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalMemoryFeatureFlagsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalMemoryFeatureFlagsKHR(int value) {
        setValue(value);
    }
}

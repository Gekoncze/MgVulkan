package cz.mg.vulkan;

public class VkExternalMemoryFeatureFlagsKHR extends VkFlags {
    public VkExternalMemoryFeatureFlagsKHR() {
    }

    public VkExternalMemoryFeatureFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalMemoryFeatureFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkExternalMemoryFeatureFlagsKHR(int value) {
        setValue(value);
    }
}

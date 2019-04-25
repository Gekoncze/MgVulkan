package cz.mg.vulkan;

public class VkExternalMemoryFeatureFlagsNV extends VkFlags {
    public VkExternalMemoryFeatureFlagsNV() {
    }

    protected VkExternalMemoryFeatureFlagsNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalMemoryFeatureFlagsNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalMemoryFeatureFlagsNV(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalMemoryFeatureFlagsNV(int value) {
        setValue(value);
    }
}

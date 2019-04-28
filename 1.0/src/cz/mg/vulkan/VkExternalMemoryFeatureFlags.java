package cz.mg.vulkan;

public class VkExternalMemoryFeatureFlags extends VkFlags {
    public VkExternalMemoryFeatureFlags() {
    }

    protected VkExternalMemoryFeatureFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalMemoryFeatureFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalMemoryFeatureFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalMemoryFeatureFlags(int value) {
        setValue(value);
    }
}

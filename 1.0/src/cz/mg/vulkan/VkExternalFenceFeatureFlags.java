package cz.mg.vulkan;

public class VkExternalFenceFeatureFlags extends VkFlags {
    public VkExternalFenceFeatureFlags() {
    }

    protected VkExternalFenceFeatureFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalFenceFeatureFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalFenceFeatureFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalFenceFeatureFlags(int value) {
        setValue(value);
    }
}

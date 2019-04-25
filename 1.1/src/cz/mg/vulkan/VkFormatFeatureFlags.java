package cz.mg.vulkan;

public class VkFormatFeatureFlags extends VkFlags {
    public VkFormatFeatureFlags() {
    }

    protected VkFormatFeatureFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkFormatFeatureFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkFormatFeatureFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkFormatFeatureFlags(int value) {
        setValue(value);
    }
}

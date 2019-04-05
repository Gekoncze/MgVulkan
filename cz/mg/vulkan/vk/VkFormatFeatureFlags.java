package cz.mg.vulkan.vk;

public class VkFormatFeatureFlags extends VkFlags {
    public VkFormatFeatureFlags() {
    }

    public VkFormatFeatureFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFormatFeatureFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkFormatFeatureFlags(int value) {
        setValue(value);
    }
}

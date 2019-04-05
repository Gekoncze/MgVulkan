package cz.mg.vulkan.vk;

public class VkExternalMemoryFeatureFlagBitsNV extends VkFlagBits {
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV = 0x00000001;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV = 0x00000002;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV = 0x00000004;

    public VkExternalMemoryFeatureFlagBitsNV() {
    }

    public VkExternalMemoryFeatureFlagBitsNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalMemoryFeatureFlagBitsNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkExternalMemoryFeatureFlagBitsNV(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV) s += "VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV";
        if(getValue() == VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV) s += "VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV";
        if(getValue() == VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV) s += "VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

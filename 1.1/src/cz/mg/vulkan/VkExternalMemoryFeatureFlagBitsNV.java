package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkExternalMemoryFeatureFlagBitsNV extends VkFlagBits {
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV = 0x00000001;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV = 0x00000002;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV = 0x00000004;

    public VkExternalMemoryFeatureFlagBitsNV() {
    }

    protected VkExternalMemoryFeatureFlagBitsNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalMemoryFeatureFlagBitsNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalMemoryFeatureFlagBitsNV(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalMemoryFeatureFlagBitsNV(int value) {
        setValue(value);
    }

    public VkExternalMemoryFeatureFlagBitsNV(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV) != 0) s.addLast("VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV");
        if((getValue() & VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV) != 0) s.addLast("VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV");
        if((getValue() & VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV) != 0) s.addLast("VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

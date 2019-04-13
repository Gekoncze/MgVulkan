package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkExternalFenceFeatureFlagBits extends VkFlagBits {
    public static final int VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT = 0x00000001;
    public static final int VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT = 0x00000002;
    public static final int VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR = VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT;
    public static final int VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR = VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT;

    public VkExternalFenceFeatureFlagBits() {
    }

    public VkExternalFenceFeatureFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalFenceFeatureFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkExternalFenceFeatureFlagBits(int value) {
        setValue(value);
    }

    public VkExternalFenceFeatureFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT) != 0) s.addLast("VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT");
        if((getValue() & VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT) != 0) s.addLast("VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT");
        if((getValue() & VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR");
        if((getValue() & VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkExternalFenceFeatureFlagBitsKHR extends VkFlagBits {
    public static final int VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR = 0x00000001;
    public static final int VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR = 0x00000002;

    public VkExternalFenceFeatureFlagBitsKHR() {
    }

    public VkExternalFenceFeatureFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalFenceFeatureFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkExternalFenceFeatureFlagBitsKHR(int value) {
        setValue(value);
    }

    public VkExternalFenceFeatureFlagBitsKHR(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR");
        if((getValue() & VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

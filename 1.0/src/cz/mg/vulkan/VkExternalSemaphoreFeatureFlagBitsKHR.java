package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkExternalSemaphoreFeatureFlagBitsKHR extends VkFlagBits {
    public static final int VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR = 0x00000001;
    public static final int VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR = 0x00000002;

    public VkExternalSemaphoreFeatureFlagBitsKHR() {
    }

    protected VkExternalSemaphoreFeatureFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalSemaphoreFeatureFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalSemaphoreFeatureFlagBitsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalSemaphoreFeatureFlagBitsKHR(int value) {
        setValue(value);
    }

    public VkExternalSemaphoreFeatureFlagBitsKHR(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR");
        if((getValue() & VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

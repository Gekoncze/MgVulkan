package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkSemaphoreImportFlagBitsKHR extends VkFlagBits {
    public static final int VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR = 0x00000001;

    public VkSemaphoreImportFlagBitsKHR() {
    }

    public VkSemaphoreImportFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSemaphoreImportFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSemaphoreImportFlagBitsKHR(int value) {
        setValue(value);
    }

    public VkSemaphoreImportFlagBitsKHR(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR) != 0) s.addLast("VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

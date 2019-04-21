package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkSemaphoreImportFlagBits extends VkFlagBits {
    public static final int VK_SEMAPHORE_IMPORT_TEMPORARY_BIT = 0x00000001;
    public static final int VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR = VK_SEMAPHORE_IMPORT_TEMPORARY_BIT;

    public VkSemaphoreImportFlagBits() {
    }

    public VkSemaphoreImportFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSemaphoreImportFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSemaphoreImportFlagBits(int value) {
        setValue(value);
    }

    public VkSemaphoreImportFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_SEMAPHORE_IMPORT_TEMPORARY_BIT) != 0) s.addLast("VK_SEMAPHORE_IMPORT_TEMPORARY_BIT");
        if((getValue() & VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR) != 0) s.addLast("VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

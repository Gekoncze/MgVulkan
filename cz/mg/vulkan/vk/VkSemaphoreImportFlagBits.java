package cz.mg.vulkan.vk;

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

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_SEMAPHORE_IMPORT_TEMPORARY_BIT) s += "VK_SEMAPHORE_IMPORT_TEMPORARY_BIT";
        if(getValue() == VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR) s += "VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

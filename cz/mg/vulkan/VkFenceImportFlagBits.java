package cz.mg.vulkan;

public class VkFenceImportFlagBits extends VkFlagBits {
    public static final int VK_FENCE_IMPORT_TEMPORARY_BIT = 0x00000001;
    public static final int VK_FENCE_IMPORT_TEMPORARY_BIT_KHR = VK_FENCE_IMPORT_TEMPORARY_BIT;

    public VkFenceImportFlagBits() {
    }

    public VkFenceImportFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFenceImportFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkFenceImportFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_FENCE_IMPORT_TEMPORARY_BIT) s += "VK_FENCE_IMPORT_TEMPORARY_BIT";
        if(getValue() == VK_FENCE_IMPORT_TEMPORARY_BIT_KHR) s += "VK_FENCE_IMPORT_TEMPORARY_BIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

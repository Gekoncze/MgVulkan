package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkFenceImportFlagBitsKHR extends VkFlagBits {
    public static final int VK_FENCE_IMPORT_TEMPORARY_BIT_KHR = 0x00000001;

    public VkFenceImportFlagBitsKHR() {
    }

    public VkFenceImportFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFenceImportFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkFenceImportFlagBitsKHR(int value) {
        setValue(value);
    }

    public VkFenceImportFlagBitsKHR(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_FENCE_IMPORT_TEMPORARY_BIT_KHR) != 0) s.addLast("VK_FENCE_IMPORT_TEMPORARY_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

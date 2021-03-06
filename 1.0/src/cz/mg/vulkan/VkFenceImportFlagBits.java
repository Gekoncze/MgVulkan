package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkFenceImportFlagBits extends VkFlagBits {
    public static final int VK_FENCE_IMPORT_TEMPORARY_BIT = 0x00000001;
    public static final int VK_FENCE_IMPORT_TEMPORARY_BIT_KHR = VK_FENCE_IMPORT_TEMPORARY_BIT;

    public VkFenceImportFlagBits() {
    }

    protected VkFenceImportFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkFenceImportFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkFenceImportFlagBits(VkPointer pointer) {
        super(pointer);
    }



    public VkFenceImportFlagBits(int value) {
        setValue(value);
    }

    public VkFenceImportFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_FENCE_IMPORT_TEMPORARY_BIT) != 0) s.addLast("VK_FENCE_IMPORT_TEMPORARY_BIT");
        if((getValue() & VK_FENCE_IMPORT_TEMPORARY_BIT_KHR) != 0) s.addLast("VK_FENCE_IMPORT_TEMPORARY_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

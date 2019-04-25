package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkObjectEntryUsageFlagBitsNVX extends VkFlagBits {
    public static final int VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX = 0x00000001;
    public static final int VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX = 0x00000002;

    public VkObjectEntryUsageFlagBitsNVX() {
    }

    protected VkObjectEntryUsageFlagBitsNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkObjectEntryUsageFlagBitsNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkObjectEntryUsageFlagBitsNVX(VkPointer pointer) {
        super(pointer);
    }



    public VkObjectEntryUsageFlagBitsNVX(int value) {
        setValue(value);
    }

    public VkObjectEntryUsageFlagBitsNVX(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX) != 0) s.addLast("VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX");
        if((getValue() & VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX) != 0) s.addLast("VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

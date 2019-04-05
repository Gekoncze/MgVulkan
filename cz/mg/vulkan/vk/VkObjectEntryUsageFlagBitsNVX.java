package cz.mg.vulkan.vk;

public class VkObjectEntryUsageFlagBitsNVX extends VkFlagBits {
    public static final int VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX = 0x00000001;
    public static final int VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX = 0x00000002;

    public VkObjectEntryUsageFlagBitsNVX() {
    }

    public VkObjectEntryUsageFlagBitsNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkObjectEntryUsageFlagBitsNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkObjectEntryUsageFlagBitsNVX(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX) s += "VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX";
        if(getValue() == VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX) s += "VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

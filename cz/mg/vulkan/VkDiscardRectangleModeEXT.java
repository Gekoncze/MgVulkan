package cz.mg.vulkan;

public class VkDiscardRectangleModeEXT extends VkEnum {
    public static final int VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT = 0;
    public static final int VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT = 1;

    public VkDiscardRectangleModeEXT() {
    }

    public VkDiscardRectangleModeEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDiscardRectangleModeEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDiscardRectangleModeEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT) return "VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT";
        if(getValue() == VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT) return "VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT";
        return "UNKNOWN";
    }
}

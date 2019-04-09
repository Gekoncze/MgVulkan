package cz.mg.vulkan;

public class VkDisplayEventTypeEXT extends VkEnum {
    public static final int VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT = 0;

    public VkDisplayEventTypeEXT() {
    }

    public VkDisplayEventTypeEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayEventTypeEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDisplayEventTypeEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT) return "VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT";
        return "UNKNOWN";
    }
}

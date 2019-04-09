package cz.mg.vulkan;

public class VkDeviceEventTypeEXT extends VkEnum {
    public static final int VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT = 0;

    public VkDeviceEventTypeEXT() {
    }

    public VkDeviceEventTypeEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceEventTypeEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDeviceEventTypeEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT) return "VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT";
        return "UNKNOWN";
    }
}

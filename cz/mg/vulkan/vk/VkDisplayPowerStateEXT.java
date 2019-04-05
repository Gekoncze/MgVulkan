package cz.mg.vulkan.vk;

public class VkDisplayPowerStateEXT extends VkEnum {
    public static final int VK_DISPLAY_POWER_STATE_OFF_EXT = 0;
    public static final int VK_DISPLAY_POWER_STATE_SUSPEND_EXT = 1;
    public static final int VK_DISPLAY_POWER_STATE_ON_EXT = 2;

    public VkDisplayPowerStateEXT() {
    }

    public VkDisplayPowerStateEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayPowerStateEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDisplayPowerStateEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_DISPLAY_POWER_STATE_OFF_EXT) return "VK_DISPLAY_POWER_STATE_OFF_EXT";
        if(getValue() == VK_DISPLAY_POWER_STATE_SUSPEND_EXT) return "VK_DISPLAY_POWER_STATE_SUSPEND_EXT";
        if(getValue() == VK_DISPLAY_POWER_STATE_ON_EXT) return "VK_DISPLAY_POWER_STATE_ON_EXT";
        return "UNKNOWN";
    }
}

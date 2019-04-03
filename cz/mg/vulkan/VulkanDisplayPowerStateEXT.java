package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayPowerStateEXT.html">khronos documentation</a>
 **/
public class VulkanDisplayPowerStateEXT extends VulkanEnum {
    public static final int DISPLAY_POWER_STATE_OFF_EXT = VkDisplayPowerStateEXT.VK_DISPLAY_POWER_STATE_OFF_EXT;
    public static final int DISPLAY_POWER_STATE_SUSPEND_EXT = VkDisplayPowerStateEXT.VK_DISPLAY_POWER_STATE_SUSPEND_EXT;
    public static final int DISPLAY_POWER_STATE_ON_EXT = VkDisplayPowerStateEXT.VK_DISPLAY_POWER_STATE_ON_EXT;

    public VulkanDisplayPowerStateEXT(){
        super(new VkDisplayPowerStateEXT());
    }

    public VulkanDisplayPowerStateEXT(VkDisplayPowerStateEXT vk){
        super(vk);
    }

    @Override
    public VkDisplayPowerStateEXT getVk(){
        return (VkDisplayPowerStateEXT) super.getVk();
    }

    public VulkanDisplayPowerStateEXT(int value){
        super(new VkDisplayPowerStateEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == DISPLAY_POWER_STATE_OFF_EXT) return "DISPLAY_POWER_STATE_OFF_EXT";
        if(getValue() == DISPLAY_POWER_STATE_SUSPEND_EXT) return "DISPLAY_POWER_STATE_SUSPEND_EXT";
        if(getValue() == DISPLAY_POWER_STATE_ON_EXT) return "DISPLAY_POWER_STATE_ON_EXT";
        return "UNKNOWN";
    }
}

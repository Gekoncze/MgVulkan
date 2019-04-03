package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceEventTypeEXT.html">khronos documentation</a>
 **/
public class VulkanDeviceEventTypeEXT extends VulkanEnum {
    public static final int DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT = VkDeviceEventTypeEXT.VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT;

    public VulkanDeviceEventTypeEXT(){
        super(new VkDeviceEventTypeEXT());
    }

    public VulkanDeviceEventTypeEXT(VkDeviceEventTypeEXT vk){
        super(vk);
    }

    @Override
    public VkDeviceEventTypeEXT getVk(){
        return (VkDeviceEventTypeEXT) super.getVk();
    }

    public VulkanDeviceEventTypeEXT(int value){
        super(new VkDeviceEventTypeEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT) return "DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT";
        return "UNKNOWN";
    }
}

package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayEventTypeEXT.html">khronos documentation</a>
 **/
public class VulkanDisplayEventTypeEXT extends VulkanEnum {
    public static final int DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT = VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT;

    public VulkanDisplayEventTypeEXT(){
        super(new VkDisplayEventTypeEXT());
    }

    public VulkanDisplayEventTypeEXT(VkDisplayEventTypeEXT vk){
        super(vk);
    }

    @Override
    public VkDisplayEventTypeEXT getVk(){
        return (VkDisplayEventTypeEXT) super.getVk();
    }

    public VulkanDisplayEventTypeEXT(int value){
        super(new VkDisplayEventTypeEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT) return "DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT";
        return "UNKNOWN";
    }
}

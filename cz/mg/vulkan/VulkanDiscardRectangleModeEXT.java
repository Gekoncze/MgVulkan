package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDiscardRectangleModeEXT.html">khronos documentation</a>
 **/
public class VulkanDiscardRectangleModeEXT extends VulkanEnum {
    public static final int DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT = VkDiscardRectangleModeEXT.VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT;
    public static final int DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT = VkDiscardRectangleModeEXT.VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT;

    public VulkanDiscardRectangleModeEXT(){
        super(new VkDiscardRectangleModeEXT());
    }

    public VulkanDiscardRectangleModeEXT(VkDiscardRectangleModeEXT vk){
        super(vk);
    }

    @Override
    public VkDiscardRectangleModeEXT getVk(){
        return (VkDiscardRectangleModeEXT) super.getVk();
    }

    public VulkanDiscardRectangleModeEXT(int value){
        super(new VkDiscardRectangleModeEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT) return "DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT";
        if(getValue() == DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT) return "DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT";
        return "UNKNOWN";
    }
}

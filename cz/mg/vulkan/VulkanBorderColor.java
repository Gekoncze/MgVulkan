package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBorderColor.html">khronos documentation</a>
 **/
public class VulkanBorderColor extends VulkanEnum {
    public static final int FLOAT_TRANSPARENT_BLACK = VkBorderColor.VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK;
    public static final int INT_TRANSPARENT_BLACK = VkBorderColor.VK_BORDER_COLOR_INT_TRANSPARENT_BLACK;
    public static final int FLOAT_OPAQUE_BLACK = VkBorderColor.VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK;
    public static final int INT_OPAQUE_BLACK = VkBorderColor.VK_BORDER_COLOR_INT_OPAQUE_BLACK;
    public static final int FLOAT_OPAQUE_WHITE = VkBorderColor.VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE;
    public static final int INT_OPAQUE_WHITE = VkBorderColor.VK_BORDER_COLOR_INT_OPAQUE_WHITE;

    public VulkanBorderColor(){
        super(new VkBorderColor());
    }

    public VulkanBorderColor(VkBorderColor vk){
        super(vk);
    }

    @Override
    public VkBorderColor getVk(){
        return (VkBorderColor) super.getVk();
    }

    public VulkanBorderColor(int value){
        super(new VkBorderColor(value));
    }

    @Override
    public String toString() {
        if(getValue() == FLOAT_TRANSPARENT_BLACK) return "FLOAT_TRANSPARENT_BLACK";
        if(getValue() == INT_TRANSPARENT_BLACK) return "INT_TRANSPARENT_BLACK";
        if(getValue() == FLOAT_OPAQUE_BLACK) return "FLOAT_OPAQUE_BLACK";
        if(getValue() == INT_OPAQUE_BLACK) return "INT_OPAQUE_BLACK";
        if(getValue() == FLOAT_OPAQUE_WHITE) return "FLOAT_OPAQUE_WHITE";
        if(getValue() == INT_OPAQUE_WHITE) return "INT_OPAQUE_WHITE";
        return "UNKNOWN";
    }
}

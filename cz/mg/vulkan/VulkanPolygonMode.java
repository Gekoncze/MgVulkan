package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPolygonMode.html">khronos documentation</a>
 **/
public class VulkanPolygonMode extends VulkanEnum {
    public static final int FILL = VkPolygonMode.VK_POLYGON_MODE_FILL;
    public static final int LINE = VkPolygonMode.VK_POLYGON_MODE_LINE;
    public static final int POINT = VkPolygonMode.VK_POLYGON_MODE_POINT;
    public static final int FILL_RECTANGLE_NV = VkPolygonMode.VK_POLYGON_MODE_FILL_RECTANGLE_NV;

    public VulkanPolygonMode(){
        super(new VkPolygonMode());
    }

    public VulkanPolygonMode(VkPolygonMode vk){
        super(vk);
    }

    @Override
    public VkPolygonMode getVk(){
        return (VkPolygonMode) super.getVk();
    }

    public VulkanPolygonMode(int value){
        super(new VkPolygonMode(value));
    }

    @Override
    public String toString() {
        if(getValue() == FILL) return "FILL";
        if(getValue() == LINE) return "LINE";
        if(getValue() == POINT) return "POINT";
        if(getValue() == FILL_RECTANGLE_NV) return "FILL_RECTANGLE_NV";
        return "UNKNOWN";
    }
}

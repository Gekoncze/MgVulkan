package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPrimitiveTopology.html">khronos documentation</a>
 **/
public class VulkanPrimitiveTopology extends VulkanEnum {
    public static final int POINT_LIST = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_POINT_LIST;
    public static final int LINE_LIST = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_LINE_LIST;
    public static final int LINE_STRIP = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_LINE_STRIP;
    public static final int TRIANGLE_LIST = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST;
    public static final int TRIANGLE_STRIP = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP;
    public static final int TRIANGLE_FAN = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN;
    public static final int LINE_LIST_WITH_ADJACENCY = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY;
    public static final int LINE_STRIP_WITH_ADJACENCY = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY;
    public static final int TRIANGLE_LIST_WITH_ADJACENCY = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY;
    public static final int TRIANGLE_STRIP_WITH_ADJACENCY = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY;
    public static final int PATCH_LIST = VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_PATCH_LIST;

    public VulkanPrimitiveTopology(){
        super(new VkPrimitiveTopology());
    }

    public VulkanPrimitiveTopology(VkPrimitiveTopology vk){
        super(vk);
    }

    @Override
    public VkPrimitiveTopology getVk(){
        return (VkPrimitiveTopology) super.getVk();
    }

    public VulkanPrimitiveTopology(int value){
        super(new VkPrimitiveTopology(value));
    }

    @Override
    public String toString() {
        if(getValue() == POINT_LIST) return "POINT_LIST";
        if(getValue() == LINE_LIST) return "LINE_LIST";
        if(getValue() == LINE_STRIP) return "LINE_STRIP";
        if(getValue() == TRIANGLE_LIST) return "TRIANGLE_LIST";
        if(getValue() == TRIANGLE_STRIP) return "TRIANGLE_STRIP";
        if(getValue() == TRIANGLE_FAN) return "TRIANGLE_FAN";
        if(getValue() == LINE_LIST_WITH_ADJACENCY) return "LINE_LIST_WITH_ADJACENCY";
        if(getValue() == LINE_STRIP_WITH_ADJACENCY) return "LINE_STRIP_WITH_ADJACENCY";
        if(getValue() == TRIANGLE_LIST_WITH_ADJACENCY) return "TRIANGLE_LIST_WITH_ADJACENCY";
        if(getValue() == TRIANGLE_STRIP_WITH_ADJACENCY) return "TRIANGLE_STRIP_WITH_ADJACENCY";
        if(getValue() == PATCH_LIST) return "PATCH_LIST";
        return "UNKNOWN";
    }
}

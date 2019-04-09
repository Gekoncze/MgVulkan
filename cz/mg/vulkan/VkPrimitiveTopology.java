package cz.mg.vulkan;

public class VkPrimitiveTopology extends VkEnum {
    public static final int VK_PRIMITIVE_TOPOLOGY_POINT_LIST = 0;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST = 1;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP = 2;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST = 3;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP = 4;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN = 5;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY = 6;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY = 7;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY = 8;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY = 9;
    public static final int VK_PRIMITIVE_TOPOLOGY_PATCH_LIST = 10;

    public VkPrimitiveTopology() {
    }

    public VkPrimitiveTopology(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPrimitiveTopology(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPrimitiveTopology(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_POINT_LIST) return "VK_PRIMITIVE_TOPOLOGY_POINT_LIST";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_LINE_LIST) return "VK_PRIMITIVE_TOPOLOGY_LINE_LIST";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_LINE_STRIP) return "VK_PRIMITIVE_TOPOLOGY_LINE_STRIP";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST) return "VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP) return "VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN) return "VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY) return "VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY) return "VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY) return "VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY) return "VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_PATCH_LIST) return "VK_PRIMITIVE_TOPOLOGY_PATCH_LIST";
        return "UNKNOWN";
    }
}

package cz.mg.vulkan.vk;

public class VkPolygonMode extends VkEnum {
    public static final int VK_POLYGON_MODE_FILL = 0;
    public static final int VK_POLYGON_MODE_LINE = 1;
    public static final int VK_POLYGON_MODE_POINT = 2;
    public static final int VK_POLYGON_MODE_FILL_RECTANGLE_NV = 1000153000;

    public VkPolygonMode() {
    }

    public VkPolygonMode(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPolygonMode(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPolygonMode(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_POLYGON_MODE_FILL) return "VK_POLYGON_MODE_FILL";
        if(getValue() == VK_POLYGON_MODE_LINE) return "VK_POLYGON_MODE_LINE";
        if(getValue() == VK_POLYGON_MODE_POINT) return "VK_POLYGON_MODE_POINT";
        if(getValue() == VK_POLYGON_MODE_FILL_RECTANGLE_NV) return "VK_POLYGON_MODE_FILL_RECTANGLE_NV";
        return "UNKNOWN";
    }
}

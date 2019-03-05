package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkPolygonMode;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanPolygonMode {
    public static final int FILL = VkPolygonMode.VK_POLYGON_MODE_FILL;
    public static final int LINE = VkPolygonMode.VK_POLYGON_MODE_LINE;
    public static final int POINT = VkPolygonMode.VK_POLYGON_MODE_POINT;
    public static final int FILL_RECTANGLE_NV = VkPolygonMode.VK_POLYGON_MODE_FILL_RECTANGLE_NV;

    public final VkPolygonMode enums;

    public VulkanPolygonMode() {
        this(0);
    }

    public VulkanPolygonMode(int value) {
        this(new VkPolygonMode(value));
    }

    public VulkanPolygonMode(VkPolygonMode enums) {
        this.enums = enums;
    }

    public boolean is(int value){
        return this.enums.value == value;
    }

    public void set(int value){
        this.enums.value = value;
    }

    @Override
    public String toString() {
        return ToString.constantToString(enums.value, VkPolygonMode.class);
    }
}

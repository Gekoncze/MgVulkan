package cz.mg.vulkan.jna.enums;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef enum VkPolygonMode
 *  @see <a href = "https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPolygonMode.html">khronos documentation</a>
 **/
public class VkPolygonMode extends Structure {
    public static final int VK_POLYGON_MODE_FILL = 0;
    public static final int VK_POLYGON_MODE_LINE = 1;
    public static final int VK_POLYGON_MODE_POINT = 2;
    public static final int VK_POLYGON_MODE_FILL_RECTANGLE_NV = 1000153000;

    public int value;

    public VkPolygonMode() {
    }

    public VkPolygonMode(int value) {
        this.value = value;
    }

    public VkPolygonMode(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkPolygonMode implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkPolygonMode implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

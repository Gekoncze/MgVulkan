package cz.mg.vulkan.jna.enums;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef enum VkImageTiling
 *  @see <a href = "https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageTiling.html">khronos documentation</a>
 **/
public class VkImageTiling extends Structure {
    public static final int VK_IMAGE_TILING_OPTIMAL = 0;
    public static final int VK_IMAGE_TILING_LINEAR = 1;

    public int value;

    public VkImageTiling() {
    }

    public VkImageTiling(int value) {
        this.value = value;
    }

    public VkImageTiling(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkImageTiling implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkImageTiling implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

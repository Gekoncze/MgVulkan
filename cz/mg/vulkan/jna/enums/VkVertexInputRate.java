package cz.mg.vulkan.jna.enums;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef enum VkVertexInputRate
 *  @see <a href = "https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkVertexInputRate.html">khronos documentation</a>
 **/
public class VkVertexInputRate extends Structure {
    public static final int VK_VERTEX_INPUT_RATE_VERTEX = 0;
    public static final int VK_VERTEX_INPUT_RATE_INSTANCE = 1;

    public int value;

    public VkVertexInputRate() {
    }

    public VkVertexInputRate(int value) {
        this.value = value;
    }

    public VkVertexInputRate(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkVertexInputRate implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkVertexInputRate implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkPipelineVertexInputStateCreateFlags
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineVertexInputStateCreateFlags.html">khronos documentation</a>
 **/
public class VkPipelineVertexInputStateCreateFlags extends Structure {
    public int value;

    public VkPipelineVertexInputStateCreateFlags() {
    }

    public VkPipelineVertexInputStateCreateFlags(int value) {
        this.value = value;
    }

    public VkPipelineVertexInputStateCreateFlags(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkPipelineVertexInputStateCreateFlags implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkPipelineVertexInputStateCreateFlags implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkPipelineRasterizationStateCreateFlags
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineRasterizationStateCreateFlags.html">khronos documentation</a>
 **/
public class VkPipelineRasterizationStateCreateFlags extends Structure {
    public int value;

    public VkPipelineRasterizationStateCreateFlags() {
    }

    public VkPipelineRasterizationStateCreateFlags(int value) {
        this.value = value;
    }

    public VkPipelineRasterizationStateCreateFlags(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkPipelineRasterizationStateCreateFlags implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkPipelineRasterizationStateCreateFlags implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

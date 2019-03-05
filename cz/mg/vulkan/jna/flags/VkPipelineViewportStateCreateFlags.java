package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkPipelineViewportStateCreateFlags
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineViewportStateCreateFlags.html">khronos documentation</a>
 **/
public class VkPipelineViewportStateCreateFlags extends Structure {
    public int value;

    public VkPipelineViewportStateCreateFlags() {
    }

    public VkPipelineViewportStateCreateFlags(int value) {
        this.value = value;
    }

    public VkPipelineViewportStateCreateFlags(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkPipelineViewportStateCreateFlags implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkPipelineViewportStateCreateFlags implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

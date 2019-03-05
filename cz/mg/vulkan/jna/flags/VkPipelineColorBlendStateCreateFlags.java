package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkPipelineColorBlendStateCreateFlags
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineColorBlendStateCreateFlags.html">khronos documentation</a>
 **/
public class VkPipelineColorBlendStateCreateFlags extends Structure {
    public int value;

    public VkPipelineColorBlendStateCreateFlags() {
    }

    public VkPipelineColorBlendStateCreateFlags(int value) {
        this.value = value;
    }

    public VkPipelineColorBlendStateCreateFlags(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkPipelineColorBlendStateCreateFlags implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkPipelineColorBlendStateCreateFlags implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

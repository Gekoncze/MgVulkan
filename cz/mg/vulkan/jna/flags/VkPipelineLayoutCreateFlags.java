package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkPipelineLayoutCreateFlags
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineLayoutCreateFlags.html">khronos documentation</a>
 **/
public class VkPipelineLayoutCreateFlags extends Structure {
    public int value;

    public VkPipelineLayoutCreateFlags() {
    }

    public VkPipelineLayoutCreateFlags(int value) {
        this.value = value;
    }

    public VkPipelineLayoutCreateFlags(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkPipelineLayoutCreateFlags implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkPipelineLayoutCreateFlags implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

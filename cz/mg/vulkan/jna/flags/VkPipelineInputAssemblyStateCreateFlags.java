package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkPipelineInputAssemblyStateCreateFlags
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineInputAssemblyStateCreateFlags.html">khronos documentation</a>
 **/
public class VkPipelineInputAssemblyStateCreateFlags extends Structure {
    public int value;

    public VkPipelineInputAssemblyStateCreateFlags() {
    }

    public VkPipelineInputAssemblyStateCreateFlags(int value) {
        this.value = value;
    }

    public VkPipelineInputAssemblyStateCreateFlags(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkPipelineInputAssemblyStateCreateFlags implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkPipelineInputAssemblyStateCreateFlags implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

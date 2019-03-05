package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkPipelineDynamicStateCreateFlags
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineDynamicStateCreateFlags.html">khronos documentation</a>
 **/
public class VkPipelineDynamicStateCreateFlags extends Structure {
    public int value;

    public VkPipelineDynamicStateCreateFlags() {
    }

    public VkPipelineDynamicStateCreateFlags(int value) {
        this.value = value;
    }

    public VkPipelineDynamicStateCreateFlags(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkPipelineDynamicStateCreateFlags implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkPipelineDynamicStateCreateFlags implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

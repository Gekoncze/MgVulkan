package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkPipelineDepthStencilStateCreateFlags
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineDepthStencilStateCreateFlags.html">khronos documentation</a>
 **/
public class VkPipelineDepthStencilStateCreateFlags extends Structure {
    public int value;

    public VkPipelineDepthStencilStateCreateFlags() {
    }

    public VkPipelineDepthStencilStateCreateFlags(int value) {
        this.value = value;
    }

    public VkPipelineDepthStencilStateCreateFlags(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkPipelineDepthStencilStateCreateFlags implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkPipelineDepthStencilStateCreateFlags implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

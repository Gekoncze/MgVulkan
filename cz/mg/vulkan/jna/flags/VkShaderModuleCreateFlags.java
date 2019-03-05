package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkShaderModuleCreateFlags
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkShaderModuleCreateFlags.html">khronos documentation</a>
 **/
public class VkShaderModuleCreateFlags extends Structure {
    public int value;

    public VkShaderModuleCreateFlags() {
    }

    public VkShaderModuleCreateFlags(int value) {
        this.value = value;
    }

    public VkShaderModuleCreateFlags(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkShaderModuleCreateFlags implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkShaderModuleCreateFlags implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

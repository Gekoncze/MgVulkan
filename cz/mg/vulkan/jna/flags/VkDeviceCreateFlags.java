package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkDeviceCreateFlags
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceCreateFlags.html">khronos documentation</a>
 **/
public class VkDeviceCreateFlags extends Structure {
    public int value;

    public VkDeviceCreateFlags() {
    }

    public VkDeviceCreateFlags(int value) {
        this.value = value;
    }

    public VkDeviceCreateFlags(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkDeviceCreateFlags implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkDeviceCreateFlags implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

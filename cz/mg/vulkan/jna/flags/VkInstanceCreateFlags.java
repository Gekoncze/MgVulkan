package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkInstanceCreateFlags
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkInstanceCreateFlags.html">khronos documentation</a>
 **/
public class VkInstanceCreateFlags extends Structure {
    public int value;

    public VkInstanceCreateFlags() {
    }

    public VkInstanceCreateFlags(int value) {
        this.value = value;
    }

    public VkInstanceCreateFlags(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkInstanceCreateFlags implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkInstanceCreateFlags implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

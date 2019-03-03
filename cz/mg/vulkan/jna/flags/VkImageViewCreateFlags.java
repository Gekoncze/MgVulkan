package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkImageViewCreateFlags
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageViewCreateFlags.html">khronos documentation</a>
 **/
public class VkImageViewCreateFlags extends Structure {
    public int value;

    public VkImageViewCreateFlags() {
    }

    public VkImageViewCreateFlags(int value) {
        this.value = value;
    }

    public VkImageViewCreateFlags(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkImageViewCreateFlags implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkImageViewCreateFlags implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkDebugUtilsMessengerCreateFlagsEXT
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessengerCreateFlagsEXT.html">khronos documentation</a>
 **/
public class VkDebugUtilsMessengerCreateFlagsEXT extends Structure {
    public int value;

    public VkDebugUtilsMessengerCreateFlagsEXT() {
    }

    public VkDebugUtilsMessengerCreateFlagsEXT(int value) {
        this.value = value;
    }

    public VkDebugUtilsMessengerCreateFlagsEXT(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkDebugUtilsMessengerCreateFlagsEXT implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkDebugUtilsMessengerCreateFlagsEXT implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

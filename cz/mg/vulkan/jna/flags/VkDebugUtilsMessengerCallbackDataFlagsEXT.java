package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkDebugUtilsMessengerCallbackDataFlagsEXT
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessengerCallbackDataFlagsEXT.html">khronos documentation</a>
 **/
public class VkDebugUtilsMessengerCallbackDataFlagsEXT extends Structure {
    public int value;

    public VkDebugUtilsMessengerCallbackDataFlagsEXT() {
    }

    public VkDebugUtilsMessengerCallbackDataFlagsEXT(int value) {
        this.value = value;
    }

    public VkDebugUtilsMessengerCallbackDataFlagsEXT(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkDebugUtilsMessengerCallbackDataFlagsEXT implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkDebugUtilsMessengerCallbackDataFlagsEXT implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

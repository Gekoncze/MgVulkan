package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkDebugUtilsMessageTypeFlagsEXT
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessageTypeFlagsEXT.html">khronos documentation</a>
 **/
public class VkDebugUtilsMessageTypeFlagsEXT extends Structure {
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT = 0x00000001;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT = 0x00000002;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT = 0x00000004;

    public int value;

    public VkDebugUtilsMessageTypeFlagsEXT() {
    }

    public VkDebugUtilsMessageTypeFlagsEXT(int value) {
        this.value = value;
    }

    public VkDebugUtilsMessageTypeFlagsEXT(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkDebugUtilsMessageTypeFlagsEXT implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkDebugUtilsMessageTypeFlagsEXT implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

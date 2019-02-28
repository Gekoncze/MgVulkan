package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkDebugUtilsMessageSeverityFlagsEXT
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessageSeverityFlagsEXT.html">khronos documentation</a>
 **/
public class VkDebugUtilsMessageSeverityFlagsEXT extends Structure {
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT = 0x00000001;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT = 0x00000010;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT = 0x00000100;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT = 0x00001000;

    public int value;

    public VkDebugUtilsMessageSeverityFlagsEXT() {
    }

    public VkDebugUtilsMessageSeverityFlagsEXT(int value) {
        this.value = value;
    }

    public VkDebugUtilsMessageSeverityFlagsEXT(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkDebugUtilsMessageSeverityFlagsEXT implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkDebugUtilsMessageSeverityFlagsEXT implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

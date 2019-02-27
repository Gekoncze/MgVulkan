package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkDebugReportFlagsEXT
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugReportFlagsEXT.html">khronos documentation</a>
 **/
public class VkDebugReportFlagsEXT extends Structure {
    public static final int VK_DEBUG_REPORT_INFORMATION_BIT_EXT = 0x00000001;
    public static final int VK_DEBUG_REPORT_WARNING_BIT_EXT = 0x00000002;
    public static final int VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = 0x00000004;
    public static final int VK_DEBUG_REPORT_ERROR_BIT_EXT = 0x00000008;
    public static final int VK_DEBUG_REPORT_DEBUG_BIT_EXT = 0x00000010;
    public static final int VK_DEBUG_REPORT_FLAG_BITS_MAX_ENUM_EXT = 0x7FFFFFFF;

    public int value;

    public VkDebugReportFlagsEXT() {
    }

    public VkDebugReportFlagsEXT(int value) {
        this.value = value;
    }

    public VkDebugReportFlagsEXT(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkDebugReportFlagsEXT implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkDebugReportFlagsEXT implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}

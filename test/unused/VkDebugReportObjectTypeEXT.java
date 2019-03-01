package test.unused;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef enum VkDebugReportObjectTypeEXT
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugReportObjectTypeEXT.html">khronos documentation</a>
 **/
public class VkDebugReportObjectTypeEXT extends Structure {
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT = 0;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT = 1;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT = 2;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT = 3;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT = 4;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT = 5;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT = 6;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT = 7;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT = 8;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT = 9;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT = 10;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT = 11;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT = 12;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT = 13;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT = 14;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT = 15;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT = 16;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT = 17;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT = 18;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT = 19;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT = 20;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT = 21;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT = 22;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT = 23;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT = 24;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT = 25;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT = 26;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT = 27;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT = 28;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT = 29;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT = 30;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT = 31;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT = 32;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT = 33;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT = 1000156000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT = 1000085000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV_EXT = 1000165000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT = VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT = VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT = VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR_EXT = VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT;

    public int value;

    public VkDebugReportObjectTypeEXT() {
    }

    public VkDebugReportObjectTypeEXT(int value) {
        this.value = value;
    }

    public VkDebugReportObjectTypeEXT(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkDebugReportObjectTypeEXT implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkDebugReportObjectTypeEXT implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}
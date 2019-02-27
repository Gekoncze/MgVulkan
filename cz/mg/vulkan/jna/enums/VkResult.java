package cz.mg.vulkan.jna.enums;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef enum VkResult
 *  @see <a href = "https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkResult.html">khronos documentation</a>
 **/
public class VkResult extends Structure {
    public static final int VK_SUCCESS = 0;
    public static final int VK_NOT_READY = 1;
    public static final int VK_TIMEOUT = 2;
    public static final int VK_EVENT_SET = 3;
    public static final int VK_EVENT_RESET = 4;
    public static final int VK_INCOMPLETE = 5;
    public static final int VK_ERROR_OUT_OF_HOST_MEMORY = -1;
    public static final int VK_ERROR_OUT_OF_DEVICE_MEMORY = -2;
    public static final int VK_ERROR_INITIALIZATION_FAILED = -3;
    public static final int VK_ERROR_DEVICE_LOST = -4;
    public static final int VK_ERROR_MEMORY_MAP_FAILED = -5;
    public static final int VK_ERROR_LAYER_NOT_PRESENT = -6;
    public static final int VK_ERROR_EXTENSION_NOT_PRESENT = -7;
    public static final int VK_ERROR_FEATURE_NOT_PRESENT = -8;
    public static final int VK_ERROR_INCOMPATIBLE_DRIVER = -9;
    public static final int VK_ERROR_TOO_MANY_OBJECTS = -10;
    public static final int VK_ERROR_FORMAT_NOT_SUPPORTED = -11;
    public static final int VK_ERROR_FRAGMENTED_POOL = -12;
    public static final int VK_ERROR_OUT_OF_POOL_MEMORY = -1000069000;
    public static final int VK_ERROR_INVALID_EXTERNAL_HANDLE = -1000072003;
    public static final int VK_ERROR_SURFACE_LOST_KHR = -1000000000;
    public static final int VK_ERROR_NATIVE_WINDOW_IN_USE_KHR = -1000000001;
    public static final int VK_SUBOPTIMAL_KHR = 1000001003;
    public static final int VK_ERROR_OUT_OF_DATE_KHR = -1000001004;
    public static final int VK_ERROR_INCOMPATIBLE_DISPLAY_KHR = -1000003001;
    public static final int VK_ERROR_VALIDATION_FAILED_EXT = -1000011001;
    public static final int VK_ERROR_INVALID_SHADER_NV = -1000012000;
    public static final int VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT = -1000158000;
    public static final int VK_ERROR_FRAGMENTATION_EXT = -1000161000;
    public static final int VK_ERROR_NOT_PERMITTED_EXT = -1000174001;
    public static final int VK_ERROR_INVALID_DEVICE_ADDRESS_EXT = -1000244000;
    public static final int VK_ERROR_OUT_OF_POOL_MEMORY_KHR = VK_ERROR_OUT_OF_POOL_MEMORY;
    public static final int VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR = VK_ERROR_INVALID_EXTERNAL_HANDLE;

    public int value;

    public VkResult() {
    }

    public VkResult(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkResult implements Structure.ByReference {}
    public static class ByValue extends VkResult implements Structure.ByValue {}
}

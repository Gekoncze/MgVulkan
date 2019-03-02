package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkResult;


public enum VulkanResult {
    SUCCESS,
    NOT_READY,
    TIMEOUT,
    EVENT_SET,
    EVENT_RESET,
    INCOMPLETE,
    ERROR_OUT_OF_HOST_MEMORY,
    ERROR_OUT_OF_DEVICE_MEMORY,
    ERROR_INITIALIZATION_FAILED,
    ERROR_DEVICE_LOST,
    ERROR_MEMORY_MAP_FAILED,
    ERROR_LAYER_NOT_PRESENT,
    ERROR_EXTENSION_NOT_PRESENT,
    ERROR_FEATURE_NOT_PRESENT,
    ERROR_INCOMPATIBLE_DRIVER,
    ERROR_TOO_MANY_OBJECTS,
    ERROR_FORMAT_NOT_SUPPORTED,
    ERROR_FRAGMENTED_POOL,
    ERROR_OUT_OF_POOL_MEMORY,
    ERROR_INVALID_EXTERNAL_HANDLE,
    ERROR_SURFACE_LOST,
    ERROR_NATIVE_WINDOW_IN_USE,
    SUBOPTIMAL,
    ERROR_OUT_OF_DATE,
    ERROR_INCOMPATIBLE_DISPLAY,
    ERROR_VALIDATION_FAILED,
    ERROR_INVALID_SHADER_NV,
    ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT,
    ERROR_FRAGMENTATION,
    ERROR_NOT_PERMITTED,
    ERROR_INVALID_DEVICE_ADDRESS;

    public static VulkanResult fromNativeEnum(VkResult e){
        switch(e.value){
            case VkResult.VK_SUCCESS: return SUCCESS;
            case VkResult.VK_NOT_READY: return NOT_READY;
            case VkResult.VK_TIMEOUT: return TIMEOUT;
            case VkResult.VK_EVENT_SET: return EVENT_SET;
            case VkResult.VK_EVENT_RESET: return EVENT_RESET;
            case VkResult.VK_INCOMPLETE: return INCOMPLETE;
            case VkResult.VK_ERROR_OUT_OF_HOST_MEMORY: return ERROR_OUT_OF_HOST_MEMORY;
            case VkResult.VK_ERROR_OUT_OF_DEVICE_MEMORY: return ERROR_OUT_OF_DEVICE_MEMORY;
            case VkResult.VK_ERROR_INITIALIZATION_FAILED: return ERROR_INITIALIZATION_FAILED;
            case VkResult.VK_ERROR_DEVICE_LOST: return ERROR_DEVICE_LOST;
            case VkResult.VK_ERROR_MEMORY_MAP_FAILED: return ERROR_MEMORY_MAP_FAILED;
            case VkResult.VK_ERROR_LAYER_NOT_PRESENT: return ERROR_LAYER_NOT_PRESENT;
            case VkResult.VK_ERROR_EXTENSION_NOT_PRESENT: return ERROR_EXTENSION_NOT_PRESENT;
            case VkResult.VK_ERROR_FEATURE_NOT_PRESENT: return ERROR_FEATURE_NOT_PRESENT;
            case VkResult.VK_ERROR_INCOMPATIBLE_DRIVER: return ERROR_INCOMPATIBLE_DRIVER;
            case VkResult.VK_ERROR_TOO_MANY_OBJECTS: return ERROR_TOO_MANY_OBJECTS;
            case VkResult.VK_ERROR_FORMAT_NOT_SUPPORTED: return ERROR_FORMAT_NOT_SUPPORTED;
            case VkResult.VK_ERROR_FRAGMENTED_POOL: return ERROR_FRAGMENTED_POOL;
            case VkResult.VK_ERROR_OUT_OF_POOL_MEMORY: return ERROR_OUT_OF_POOL_MEMORY;
            case VkResult.VK_ERROR_INVALID_EXTERNAL_HANDLE: return ERROR_INVALID_EXTERNAL_HANDLE;
            case VkResult.VK_ERROR_SURFACE_LOST_KHR: return ERROR_SURFACE_LOST;
            case VkResult.VK_ERROR_NATIVE_WINDOW_IN_USE_KHR: return ERROR_NATIVE_WINDOW_IN_USE;
            case VkResult.VK_SUBOPTIMAL_KHR: return SUBOPTIMAL;
            case VkResult.VK_ERROR_OUT_OF_DATE_KHR: return ERROR_OUT_OF_DATE;
            case VkResult.VK_ERROR_INCOMPATIBLE_DISPLAY_KHR: return ERROR_INCOMPATIBLE_DISPLAY;
            case VkResult.VK_ERROR_VALIDATION_FAILED_EXT: return ERROR_VALIDATION_FAILED;
            case VkResult.VK_ERROR_INVALID_SHADER_NV: return ERROR_INVALID_SHADER_NV;
            case VkResult.VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT: return ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT;
            case VkResult.VK_ERROR_FRAGMENTATION_EXT: return ERROR_FRAGMENTATION;
            case VkResult.VK_ERROR_NOT_PERMITTED_EXT: return ERROR_NOT_PERMITTED;
            case VkResult.VK_ERROR_INVALID_DEVICE_ADDRESS_EXT: return ERROR_INVALID_DEVICE_ADDRESS;
            default: return null;
        }
    }

    public VkResult toNativeEnum(){
        switch(this){
            case SUCCESS: return new VkResult(VkResult.VK_SUCCESS);
            case NOT_READY: return new VkResult(VkResult.VK_NOT_READY);
            case TIMEOUT: return new VkResult(VkResult.VK_TIMEOUT);
            case EVENT_SET: return new VkResult(VkResult.VK_EVENT_SET);
            case EVENT_RESET: return new VkResult(VkResult.VK_EVENT_RESET);
            case INCOMPLETE: return new VkResult(VkResult.VK_INCOMPLETE);
            case ERROR_OUT_OF_HOST_MEMORY: return new VkResult(VkResult.VK_ERROR_OUT_OF_HOST_MEMORY);
            case ERROR_OUT_OF_DEVICE_MEMORY: return new VkResult(VkResult.VK_ERROR_OUT_OF_DEVICE_MEMORY);
            case ERROR_INITIALIZATION_FAILED: return new VkResult(VkResult.VK_ERROR_INITIALIZATION_FAILED);
            case ERROR_DEVICE_LOST: return new VkResult(VkResult.VK_ERROR_DEVICE_LOST);
            case ERROR_MEMORY_MAP_FAILED: return new VkResult(VkResult.VK_ERROR_MEMORY_MAP_FAILED);
            case ERROR_LAYER_NOT_PRESENT: return new VkResult(VkResult.VK_ERROR_LAYER_NOT_PRESENT);
            case ERROR_EXTENSION_NOT_PRESENT: return new VkResult(VkResult.VK_ERROR_EXTENSION_NOT_PRESENT);
            case ERROR_FEATURE_NOT_PRESENT: return new VkResult(VkResult.VK_ERROR_FEATURE_NOT_PRESENT);
            case ERROR_INCOMPATIBLE_DRIVER: return new VkResult(VkResult.VK_ERROR_INCOMPATIBLE_DRIVER);
            case ERROR_TOO_MANY_OBJECTS: return new VkResult(VkResult.VK_ERROR_TOO_MANY_OBJECTS);
            case ERROR_FORMAT_NOT_SUPPORTED: return new VkResult(VkResult.VK_ERROR_FORMAT_NOT_SUPPORTED);
            case ERROR_FRAGMENTED_POOL: return new VkResult(VkResult.VK_ERROR_FRAGMENTED_POOL);
            case ERROR_OUT_OF_POOL_MEMORY: return new VkResult(VkResult.VK_ERROR_OUT_OF_POOL_MEMORY);
            case ERROR_INVALID_EXTERNAL_HANDLE: return new VkResult(VkResult.VK_ERROR_INVALID_EXTERNAL_HANDLE);
            case ERROR_SURFACE_LOST: return new VkResult(VkResult.VK_ERROR_SURFACE_LOST_KHR);
            case ERROR_NATIVE_WINDOW_IN_USE: return new VkResult(VkResult.VK_ERROR_NATIVE_WINDOW_IN_USE_KHR);
            case SUBOPTIMAL: return new VkResult(VkResult.VK_SUBOPTIMAL_KHR);
            case ERROR_OUT_OF_DATE: return new VkResult(VkResult.VK_ERROR_OUT_OF_DATE_KHR);
            case ERROR_INCOMPATIBLE_DISPLAY: return new VkResult(VkResult.VK_ERROR_INCOMPATIBLE_DISPLAY_KHR);
            case ERROR_VALIDATION_FAILED: return new VkResult(VkResult.VK_ERROR_VALIDATION_FAILED_EXT);
            case ERROR_INVALID_SHADER_NV: return new VkResult(VkResult.VK_ERROR_INVALID_SHADER_NV);
            case ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT: return new VkResult(VkResult.VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT);
            case ERROR_FRAGMENTATION: return new VkResult(VkResult.VK_ERROR_FRAGMENTATION_EXT);
            case ERROR_NOT_PERMITTED: return new VkResult(VkResult.VK_ERROR_NOT_PERMITTED_EXT);
            case ERROR_INVALID_DEVICE_ADDRESS: return new VkResult(VkResult.VK_ERROR_INVALID_DEVICE_ADDRESS_EXT);
            default: throw new RuntimeException();
        }
    }
}

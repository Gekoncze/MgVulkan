package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkResult;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanResult {
    public static final int SUCCESS = VkResult.VK_SUCCESS;
    public static final int NOT_READY = VkResult.VK_NOT_READY;
    public static final int TIMEOUT = VkResult.VK_TIMEOUT;
    public static final int EVENT_SET = VkResult.VK_EVENT_SET;
    public static final int EVENT_RESET = VkResult.VK_EVENT_RESET;
    public static final int INCOMPLETE = VkResult.VK_INCOMPLETE;
    public static final int ERROR_OUT_OF_HOST_MEMORY = VkResult.VK_ERROR_OUT_OF_HOST_MEMORY;
    public static final int ERROR_OUT_OF_DEVICE_MEMORY = VkResult.VK_ERROR_OUT_OF_DEVICE_MEMORY;
    public static final int ERROR_INITIALIZATION_FAILED = VkResult.VK_ERROR_INITIALIZATION_FAILED;
    public static final int ERROR_DEVICE_LOST = VkResult.VK_ERROR_DEVICE_LOST;
    public static final int ERROR_MEMORY_MAP_FAILED = VkResult.VK_ERROR_MEMORY_MAP_FAILED;
    public static final int ERROR_LAYER_NOT_PRESENT = VkResult.VK_ERROR_LAYER_NOT_PRESENT;
    public static final int ERROR_EXTENSION_NOT_PRESENT = VkResult.VK_ERROR_EXTENSION_NOT_PRESENT;
    public static final int ERROR_FEATURE_NOT_PRESENT = VkResult.VK_ERROR_FEATURE_NOT_PRESENT;
    public static final int ERROR_INCOMPATIBLE_DRIVER = VkResult.VK_ERROR_INCOMPATIBLE_DRIVER;
    public static final int ERROR_TOO_MANY_OBJECTS = VkResult.VK_ERROR_TOO_MANY_OBJECTS;
    public static final int ERROR_FORMAT_NOT_SUPPORTED = VkResult.VK_ERROR_FORMAT_NOT_SUPPORTED;
    public static final int ERROR_FRAGMENTED_POOL = VkResult.VK_ERROR_FRAGMENTED_POOL;
    public static final int ERROR_OUT_OF_POOL_MEMORY = VkResult.VK_ERROR_OUT_OF_POOL_MEMORY;
    public static final int ERROR_INVALID_EXTERNAL_HANDLE = VkResult.VK_ERROR_INVALID_EXTERNAL_HANDLE;
    public static final int ERROR_SURFACE_LOST_KHR = VkResult.VK_ERROR_SURFACE_LOST_KHR;
    public static final int ERROR_NATIVE_WINDOW_IN_USE_KHR = VkResult.VK_ERROR_NATIVE_WINDOW_IN_USE_KHR;
    public static final int SUBOPTIMAL_KHR = VkResult.VK_SUBOPTIMAL_KHR;
    public static final int ERROR_OUT_OF_DATE_KHR = VkResult.VK_ERROR_OUT_OF_DATE_KHR;
    public static final int ERROR_INCOMPATIBLE_DISPLAY_KHR = VkResult.VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;
    public static final int ERROR_VALIDATION_FAILED_EXT = VkResult.VK_ERROR_VALIDATION_FAILED_EXT;
    public static final int ERROR_INVALID_SHADER_NV = VkResult.VK_ERROR_INVALID_SHADER_NV;
    public static final int ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT = VkResult.VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT;
    public static final int ERROR_FRAGMENTATION_EXT = VkResult.VK_ERROR_FRAGMENTATION_EXT;
    public static final int ERROR_NOT_PERMITTED_EXT = VkResult.VK_ERROR_NOT_PERMITTED_EXT;
    public static final int ERROR_INVALID_DEVICE_ADDRESS_EXT = VkResult.VK_ERROR_INVALID_DEVICE_ADDRESS_EXT;
    public static final int ERROR_OUT_OF_POOL_MEMORY_KHR = VkResult.VK_ERROR_OUT_OF_POOL_MEMORY_KHR;
    public static final int ERROR_INVALID_EXTERNAL_HANDLE_KHR = VkResult.VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR;

    public final VkResult enums;

    public VulkanResult() {
        this(0);
    }

    public VulkanResult(int value) {
        this(new VkResult(value));
    }

    public VulkanResult(VkResult enums) {
        this.enums = enums;
    }

    public boolean is(int value){
        return this.enums.value == value;
    }

    public void set(int value){
        this.enums.value = value;
    }

    @Override
    public String toString() {
        return ToString.constantToString(enums.value, VkResult.class);
    }
}

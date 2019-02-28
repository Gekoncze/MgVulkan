package cz.mg.vulkan.enums;

import test.unused.VkDebugReportObjectTypeEXT;


public enum VulkanDebugReportObjectTypeEXT {
    UNKNOWN,
    INSTANCE,
    PHYSICAL_DEVICE,
    DEVICE,
    QUEUE,
    SEMAPHORE,
    COMMAND_BUFFER,
    FENCE,
    DEVICE_MEMORY,
    BUFFER,
    IMAGE,
    EVENT,
    QUERY_POOL,
    BUFFER_VIEW,
    IMAGE_VIEW,
    SHADER_MODULE,
    PIPELINE_CACHE,
    PIPELINE_LAYOUT,
    RENDER_PASS,
    PIPELINE,
    DESCRIPTOR_SET_LAYOUT,
    SAMPLER,
    DESCRIPTOR_POOL,
    DESCRIPTOR_SET,
    FRAMEBUFFER,
    COMMAND_POOL,
    SURFACE_KHR,
    SWAPCHAIN_KHR,
    DEBUG_REPORT_CALLBACK,
    DISPLAY_KHR,
    DISPLAY_MODE_KHR,
    OBJECT_TABLE_NVX,
    INDIRECT_COMMANDS_LAYOUT_NVX,
    VALIDATION_CACHE;

    public static VulkanDebugReportObjectTypeEXT fromNativeEnum(VkDebugReportObjectTypeEXT e){
        switch(e.value){
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT: return UNKNOWN;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT: return INSTANCE;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT: return PHYSICAL_DEVICE;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT: return DEVICE;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT: return QUEUE;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT: return SEMAPHORE;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT: return COMMAND_BUFFER;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT: return FENCE;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT: return DEVICE_MEMORY;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT: return BUFFER;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT: return IMAGE;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT: return EVENT;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT: return QUERY_POOL;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT: return BUFFER_VIEW;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT: return IMAGE_VIEW;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT: return SHADER_MODULE;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT: return PIPELINE_CACHE;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT: return PIPELINE_LAYOUT;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT: return RENDER_PASS;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT: return PIPELINE;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT: return DESCRIPTOR_SET_LAYOUT;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT: return SAMPLER;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT: return DESCRIPTOR_POOL;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT: return DESCRIPTOR_SET;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT: return FRAMEBUFFER;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT: return COMMAND_POOL;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT: return SURFACE_KHR;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT: return SWAPCHAIN_KHR;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT: return DEBUG_REPORT_CALLBACK;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT: return DISPLAY_KHR;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT: return DISPLAY_MODE_KHR;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT: return OBJECT_TABLE_NVX;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT: return INDIRECT_COMMANDS_LAYOUT_NVX;
            case VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT: return VALIDATION_CACHE;
            default: return null;
        }
    }
}

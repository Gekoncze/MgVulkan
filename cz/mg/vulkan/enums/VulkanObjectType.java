package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkObjectType;


public enum VulkanObjectType {
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
    SAMPLER_YCBCR_CONVERSION,
    DESCRIPTOR_UPDATE_TEMPLATE,
    SURFACE,
    SWAPCHAIN,
    DISPLAY,
    DISPLAY_MODE,
    DEBUG_REPORT_CALLBACK,
    OBJECT_TABLE_NVX,
    INDIRECT_COMMANDS_LAYOUT_NVX,
    DEBUG_UTILS_MESSENGER,
    VALIDATION_CACHE;

    public static VulkanObjectType fromNativeEnum(VkObjectType e){
        switch(e.value){
            case VkObjectType.VK_OBJECT_TYPE_UNKNOWN: return UNKNOWN;
            case VkObjectType.VK_OBJECT_TYPE_INSTANCE: return INSTANCE;
            case VkObjectType.VK_OBJECT_TYPE_PHYSICAL_DEVICE: return PHYSICAL_DEVICE;
            case VkObjectType.VK_OBJECT_TYPE_DEVICE: return DEVICE;
            case VkObjectType.VK_OBJECT_TYPE_QUEUE: return QUEUE;
            case VkObjectType.VK_OBJECT_TYPE_SEMAPHORE: return SEMAPHORE;
            case VkObjectType.VK_OBJECT_TYPE_COMMAND_BUFFER: return COMMAND_BUFFER;
            case VkObjectType.VK_OBJECT_TYPE_FENCE: return FENCE;
            case VkObjectType.VK_OBJECT_TYPE_DEVICE_MEMORY: return DEVICE_MEMORY;
            case VkObjectType.VK_OBJECT_TYPE_BUFFER: return BUFFER;
            case VkObjectType.VK_OBJECT_TYPE_IMAGE: return IMAGE;
            case VkObjectType.VK_OBJECT_TYPE_EVENT: return EVENT;
            case VkObjectType.VK_OBJECT_TYPE_QUERY_POOL: return QUERY_POOL;
            case VkObjectType.VK_OBJECT_TYPE_BUFFER_VIEW: return BUFFER_VIEW;
            case VkObjectType.VK_OBJECT_TYPE_IMAGE_VIEW: return IMAGE_VIEW;
            case VkObjectType.VK_OBJECT_TYPE_SHADER_MODULE: return SHADER_MODULE;
            case VkObjectType.VK_OBJECT_TYPE_PIPELINE_CACHE: return PIPELINE_CACHE;
            case VkObjectType.VK_OBJECT_TYPE_PIPELINE_LAYOUT: return PIPELINE_LAYOUT;
            case VkObjectType.VK_OBJECT_TYPE_RENDER_PASS: return RENDER_PASS;
            case VkObjectType.VK_OBJECT_TYPE_PIPELINE: return PIPELINE;
            case VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT: return DESCRIPTOR_SET_LAYOUT;
            case VkObjectType.VK_OBJECT_TYPE_SAMPLER: return SAMPLER;
            case VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_POOL: return DESCRIPTOR_POOL;
            case VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_SET: return DESCRIPTOR_SET;
            case VkObjectType.VK_OBJECT_TYPE_FRAMEBUFFER: return FRAMEBUFFER;
            case VkObjectType.VK_OBJECT_TYPE_COMMAND_POOL: return COMMAND_POOL;
            case VkObjectType.VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION: return SAMPLER_YCBCR_CONVERSION;
            case VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE: return DESCRIPTOR_UPDATE_TEMPLATE;
            case VkObjectType.VK_OBJECT_TYPE_SURFACE_KHR: return SURFACE;
            case VkObjectType.VK_OBJECT_TYPE_SWAPCHAIN_KHR: return SWAPCHAIN;
            case VkObjectType.VK_OBJECT_TYPE_DISPLAY_KHR: return DISPLAY;
            case VkObjectType.VK_OBJECT_TYPE_DISPLAY_MODE_KHR: return DISPLAY_MODE;
            case VkObjectType.VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT: return DEBUG_REPORT_CALLBACK;
            case VkObjectType.VK_OBJECT_TYPE_OBJECT_TABLE_NVX: return OBJECT_TABLE_NVX;
            case VkObjectType.VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX: return INDIRECT_COMMANDS_LAYOUT_NVX;
            case VkObjectType.VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT: return DEBUG_UTILS_MESSENGER;
            case VkObjectType.VK_OBJECT_TYPE_VALIDATION_CACHE_EXT: return VALIDATION_CACHE;
            default: return null;
        }
    }

    public VkObjectType toNativeEnum(){
        switch(this){
            case UNKNOWN: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_UNKNOWN);
            case INSTANCE: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_INSTANCE);
            case PHYSICAL_DEVICE: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_PHYSICAL_DEVICE);
            case DEVICE: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_DEVICE);
            case QUEUE: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_QUEUE);
            case SEMAPHORE: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_SEMAPHORE);
            case COMMAND_BUFFER: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_COMMAND_BUFFER);
            case FENCE: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_FENCE);
            case DEVICE_MEMORY: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_DEVICE_MEMORY);
            case BUFFER: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_BUFFER);
            case IMAGE: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_IMAGE);
            case EVENT: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_EVENT);
            case QUERY_POOL: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_QUERY_POOL);
            case BUFFER_VIEW: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_BUFFER_VIEW);
            case IMAGE_VIEW: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_IMAGE_VIEW);
            case SHADER_MODULE: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_SHADER_MODULE);
            case PIPELINE_CACHE: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_PIPELINE_CACHE);
            case PIPELINE_LAYOUT: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_PIPELINE_LAYOUT);
            case RENDER_PASS: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_RENDER_PASS);
            case PIPELINE: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_PIPELINE);
            case DESCRIPTOR_SET_LAYOUT: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT);
            case SAMPLER: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_SAMPLER);
            case DESCRIPTOR_POOL: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_POOL);
            case DESCRIPTOR_SET: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_SET);
            case FRAMEBUFFER: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_FRAMEBUFFER);
            case COMMAND_POOL: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_COMMAND_POOL);
            case SAMPLER_YCBCR_CONVERSION: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION);
            case DESCRIPTOR_UPDATE_TEMPLATE: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE);
            case SURFACE: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_SURFACE_KHR);
            case SWAPCHAIN: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_SWAPCHAIN_KHR);
            case DISPLAY: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_DISPLAY_KHR);
            case DISPLAY_MODE: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_DISPLAY_MODE_KHR);
            case DEBUG_REPORT_CALLBACK: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT);
            case OBJECT_TABLE_NVX: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_OBJECT_TABLE_NVX);
            case INDIRECT_COMMANDS_LAYOUT_NVX: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX);
            case DEBUG_UTILS_MESSENGER: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT);
            case VALIDATION_CACHE: return new VkObjectType(VkObjectType.VK_OBJECT_TYPE_VALIDATION_CACHE_EXT);
            default: throw new RuntimeException();
        }
    }
}

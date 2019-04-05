package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanObjectType extends VulkanEnum {
    public static final int UNKNOWN = VkObjectType.VK_OBJECT_TYPE_UNKNOWN;
    public static final int INSTANCE = VkObjectType.VK_OBJECT_TYPE_INSTANCE;
    public static final int PHYSICAL_DEVICE = VkObjectType.VK_OBJECT_TYPE_PHYSICAL_DEVICE;
    public static final int DEVICE = VkObjectType.VK_OBJECT_TYPE_DEVICE;
    public static final int QUEUE = VkObjectType.VK_OBJECT_TYPE_QUEUE;
    public static final int SEMAPHORE = VkObjectType.VK_OBJECT_TYPE_SEMAPHORE;
    public static final int COMMAND_BUFFER = VkObjectType.VK_OBJECT_TYPE_COMMAND_BUFFER;
    public static final int FENCE = VkObjectType.VK_OBJECT_TYPE_FENCE;
    public static final int DEVICE_MEMORY = VkObjectType.VK_OBJECT_TYPE_DEVICE_MEMORY;
    public static final int BUFFER = VkObjectType.VK_OBJECT_TYPE_BUFFER;
    public static final int IMAGE = VkObjectType.VK_OBJECT_TYPE_IMAGE;
    public static final int EVENT = VkObjectType.VK_OBJECT_TYPE_EVENT;
    public static final int QUERY_POOL = VkObjectType.VK_OBJECT_TYPE_QUERY_POOL;
    public static final int BUFFER_VIEW = VkObjectType.VK_OBJECT_TYPE_BUFFER_VIEW;
    public static final int IMAGE_VIEW = VkObjectType.VK_OBJECT_TYPE_IMAGE_VIEW;
    public static final int SHADER_MODULE = VkObjectType.VK_OBJECT_TYPE_SHADER_MODULE;
    public static final int PIPELINE_CACHE = VkObjectType.VK_OBJECT_TYPE_PIPELINE_CACHE;
    public static final int PIPELINE_LAYOUT = VkObjectType.VK_OBJECT_TYPE_PIPELINE_LAYOUT;
    public static final int RENDER_PASS = VkObjectType.VK_OBJECT_TYPE_RENDER_PASS;
    public static final int PIPELINE = VkObjectType.VK_OBJECT_TYPE_PIPELINE;
    public static final int DESCRIPTOR_SET_LAYOUT = VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT;
    public static final int SAMPLER = VkObjectType.VK_OBJECT_TYPE_SAMPLER;
    public static final int DESCRIPTOR_POOL = VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_POOL;
    public static final int DESCRIPTOR_SET = VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_SET;
    public static final int FRAMEBUFFER = VkObjectType.VK_OBJECT_TYPE_FRAMEBUFFER;
    public static final int COMMAND_POOL = VkObjectType.VK_OBJECT_TYPE_COMMAND_POOL;
    public static final int SAMPLER_YCBCR_CONVERSION = VkObjectType.VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION;
    public static final int DESCRIPTOR_UPDATE_TEMPLATE = VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE;
    public static final int SURFACE_KHR = VkObjectType.VK_OBJECT_TYPE_SURFACE_KHR;
    public static final int SWAPCHAIN_KHR = VkObjectType.VK_OBJECT_TYPE_SWAPCHAIN_KHR;
    public static final int DISPLAY_KHR = VkObjectType.VK_OBJECT_TYPE_DISPLAY_KHR;
    public static final int DISPLAY_MODE_KHR = VkObjectType.VK_OBJECT_TYPE_DISPLAY_MODE_KHR;
    public static final int DEBUG_REPORT_CALLBACK_EXT = VkObjectType.VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT;
    public static final int OBJECT_TABLE_NVX = VkObjectType.VK_OBJECT_TYPE_OBJECT_TABLE_NVX;
    public static final int INDIRECT_COMMANDS_LAYOUT_NVX = VkObjectType.VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX;
    public static final int DEBUG_UTILS_MESSENGER_EXT = VkObjectType.VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT;
    public static final int VALIDATION_CACHE_EXT = VkObjectType.VK_OBJECT_TYPE_VALIDATION_CACHE_EXT;
    public static final int DESCRIPTOR_UPDATE_TEMPLATE_KHR = VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR;
    public static final int SAMPLER_YCBCR_CONVERSION_KHR = VkObjectType.VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR;

    public VulkanObjectType(){
        super(new VkObjectType());
    }

    public VulkanObjectType(VkObjectType vk){
        super(vk);
    }

    @Override
    public VkObjectType getVk(){
        return (VkObjectType) super.getVk();
    }

    public VulkanObjectType(int value){
        super(new VkObjectType(value));
    }

    @Override
    public String toString() {
        if(getValue() == UNKNOWN) return "UNKNOWN";
        if(getValue() == INSTANCE) return "INSTANCE";
        if(getValue() == PHYSICAL_DEVICE) return "PHYSICAL_DEVICE";
        if(getValue() == DEVICE) return "DEVICE";
        if(getValue() == QUEUE) return "QUEUE";
        if(getValue() == SEMAPHORE) return "SEMAPHORE";
        if(getValue() == COMMAND_BUFFER) return "COMMAND_BUFFER";
        if(getValue() == FENCE) return "FENCE";
        if(getValue() == DEVICE_MEMORY) return "DEVICE_MEMORY";
        if(getValue() == BUFFER) return "BUFFER";
        if(getValue() == IMAGE) return "IMAGE";
        if(getValue() == EVENT) return "EVENT";
        if(getValue() == QUERY_POOL) return "QUERY_POOL";
        if(getValue() == BUFFER_VIEW) return "BUFFER_VIEW";
        if(getValue() == IMAGE_VIEW) return "IMAGE_VIEW";
        if(getValue() == SHADER_MODULE) return "SHADER_MODULE";
        if(getValue() == PIPELINE_CACHE) return "PIPELINE_CACHE";
        if(getValue() == PIPELINE_LAYOUT) return "PIPELINE_LAYOUT";
        if(getValue() == RENDER_PASS) return "RENDER_PASS";
        if(getValue() == PIPELINE) return "PIPELINE";
        if(getValue() == DESCRIPTOR_SET_LAYOUT) return "DESCRIPTOR_SET_LAYOUT";
        if(getValue() == SAMPLER) return "SAMPLER";
        if(getValue() == DESCRIPTOR_POOL) return "DESCRIPTOR_POOL";
        if(getValue() == DESCRIPTOR_SET) return "DESCRIPTOR_SET";
        if(getValue() == FRAMEBUFFER) return "FRAMEBUFFER";
        if(getValue() == COMMAND_POOL) return "COMMAND_POOL";
        if(getValue() == SAMPLER_YCBCR_CONVERSION) return "SAMPLER_YCBCR_CONVERSION";
        if(getValue() == DESCRIPTOR_UPDATE_TEMPLATE) return "DESCRIPTOR_UPDATE_TEMPLATE";
        if(getValue() == SURFACE_KHR) return "SURFACE_KHR";
        if(getValue() == SWAPCHAIN_KHR) return "SWAPCHAIN_KHR";
        if(getValue() == DISPLAY_KHR) return "DISPLAY_KHR";
        if(getValue() == DISPLAY_MODE_KHR) return "DISPLAY_MODE_KHR";
        if(getValue() == DEBUG_REPORT_CALLBACK_EXT) return "DEBUG_REPORT_CALLBACK_EXT";
        if(getValue() == OBJECT_TABLE_NVX) return "OBJECT_TABLE_NVX";
        if(getValue() == INDIRECT_COMMANDS_LAYOUT_NVX) return "INDIRECT_COMMANDS_LAYOUT_NVX";
        if(getValue() == DEBUG_UTILS_MESSENGER_EXT) return "DEBUG_UTILS_MESSENGER_EXT";
        if(getValue() == VALIDATION_CACHE_EXT) return "VALIDATION_CACHE_EXT";
        if(getValue() == DESCRIPTOR_UPDATE_TEMPLATE_KHR) return "DESCRIPTOR_UPDATE_TEMPLATE_KHR";
        if(getValue() == SAMPLER_YCBCR_CONVERSION_KHR) return "SAMPLER_YCBCR_CONVERSION_KHR";
        return "UNKNOWN";
    }
}

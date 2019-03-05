package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkObjectType;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanObjectType {
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

    public final VkObjectType enums;

    public VulkanObjectType() {
        this(0);
    }

    public VulkanObjectType(int value) {
        this(new VkObjectType(value));
    }

    public VulkanObjectType(VkObjectType enums) {
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
        return ToString.constantToString(enums.value, VkObjectType.class);
    }
}

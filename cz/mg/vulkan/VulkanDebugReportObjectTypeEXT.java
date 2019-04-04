package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugReportObjectTypeEXT.html">khronos documentation</a>
 **/
public class VulkanDebugReportObjectTypeEXT extends VulkanEnum {
    public static final int DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT;
    public static final int DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR_EXT;

    public VulkanDebugReportObjectTypeEXT(){
        super(new VkDebugReportObjectTypeEXT());
    }

    public VulkanDebugReportObjectTypeEXT(VkDebugReportObjectTypeEXT vk){
        super(vk);
    }

    @Override
    public VkDebugReportObjectTypeEXT getVk(){
        return (VkDebugReportObjectTypeEXT) super.getVk();
    }

    public VulkanDebugReportObjectTypeEXT(int value){
        super(new VkDebugReportObjectTypeEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT) return "DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT) return "DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT) return "DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT) return "DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT) return "DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT) return "DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT) return "DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT) return "DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT) return "DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT) return "DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT) return "DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT) return "DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT) return "DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT) return "DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT) return "DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT) return "DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT) return "DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT) return "DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT) return "DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT) return "DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT) return "DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT) return "DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT) return "DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT) return "DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT) return "DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT) return "DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT) return "DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT) return "DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT) return "DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT) return "DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT) return "DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT) return "DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT) return "DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT) return "DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT) return "DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT) return "DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT) return "DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT";
        if(getValue() == DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR_EXT) return "DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VulkanDebugReportObjectTypeEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugReportObjectTypeEXT> {
        public Array(VkDebugReportObjectTypeEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugReportObjectTypeEXT.Array(count));
        }

        public Array(int count, VulkanDebugReportObjectTypeEXT o){
            this(new VkDebugReportObjectTypeEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugReportObjectTypeEXT.Array getVk(){
            return (VkDebugReportObjectTypeEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugReportObjectTypeEXT get(int i){
            return new VulkanDebugReportObjectTypeEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugReportObjectTypeEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugReportObjectTypeEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugReportObjectTypeEXT.Pointer(value));
        }

        @Override
        public VkDebugReportObjectTypeEXT.Pointer getVk(){
            return (VkDebugReportObjectTypeEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugReportObjectTypeEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugReportObjectTypeEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugReportObjectTypeEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugReportObjectTypeEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugReportObjectTypeEXT.Pointer.Array getVk(){
                return (VkDebugReportObjectTypeEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugReportObjectTypeEXT.Pointer get(int i){
                return new VulkanDebugReportObjectTypeEXT.Pointer(getVk().get(i));
            }
        }
    }
}

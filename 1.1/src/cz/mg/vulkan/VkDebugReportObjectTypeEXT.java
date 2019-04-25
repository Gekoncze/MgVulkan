package cz.mg.vulkan;

public class VkDebugReportObjectTypeEXT extends VkEnum {
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
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT = VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR_EXT = VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT;

    public VkDebugReportObjectTypeEXT() {
    }

    protected VkDebugReportObjectTypeEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDebugReportObjectTypeEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDebugReportObjectTypeEXT(int value) {
        setValue(value);
    }

    public VkDebugReportObjectTypeEXT(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT";
        if(getValue() == VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR_EXT) return "VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VkDebugReportObjectTypeEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugReportObjectTypeEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugReportObjectTypeEXT.sizeof()));
            this.count = count;
        }

        public Array(VkDebugReportObjectTypeEXT o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }



        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValue(i, values[i]);
        }

        public int getValue(int i){
            return getValueNative(address(i));
        }

        public void setValue(int i, int value){
            setValueNative(address(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDebugReportObjectTypeEXT get(int i){
            return new VkDebugReportObjectTypeEXT(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}

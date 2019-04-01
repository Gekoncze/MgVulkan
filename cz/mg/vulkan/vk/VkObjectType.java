package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkObjectType.html">khronos documentation</a>
 **/
public class VkObjectType extends VkEnum {
    public static final int VK_OBJECT_TYPE_UNKNOWN = 0;
    public static final int VK_OBJECT_TYPE_INSTANCE = 1;
    public static final int VK_OBJECT_TYPE_PHYSICAL_DEVICE = 2;
    public static final int VK_OBJECT_TYPE_DEVICE = 3;
    public static final int VK_OBJECT_TYPE_QUEUE = 4;
    public static final int VK_OBJECT_TYPE_SEMAPHORE = 5;
    public static final int VK_OBJECT_TYPE_COMMAND_BUFFER = 6;
    public static final int VK_OBJECT_TYPE_FENCE = 7;
    public static final int VK_OBJECT_TYPE_DEVICE_MEMORY = 8;
    public static final int VK_OBJECT_TYPE_BUFFER = 9;
    public static final int VK_OBJECT_TYPE_IMAGE = 10;
    public static final int VK_OBJECT_TYPE_EVENT = 11;
    public static final int VK_OBJECT_TYPE_QUERY_POOL = 12;
    public static final int VK_OBJECT_TYPE_BUFFER_VIEW = 13;
    public static final int VK_OBJECT_TYPE_IMAGE_VIEW = 14;
    public static final int VK_OBJECT_TYPE_SHADER_MODULE = 15;
    public static final int VK_OBJECT_TYPE_PIPELINE_CACHE = 16;
    public static final int VK_OBJECT_TYPE_PIPELINE_LAYOUT = 17;
    public static final int VK_OBJECT_TYPE_RENDER_PASS = 18;
    public static final int VK_OBJECT_TYPE_PIPELINE = 19;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT = 20;
    public static final int VK_OBJECT_TYPE_SAMPLER = 21;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_POOL = 22;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_SET = 23;
    public static final int VK_OBJECT_TYPE_FRAMEBUFFER = 24;
    public static final int VK_OBJECT_TYPE_COMMAND_POOL = 25;
    public static final int VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION = 1000156000;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE = 1000085000;
    public static final int VK_OBJECT_TYPE_SURFACE_KHR = 1000000000;
    public static final int VK_OBJECT_TYPE_SWAPCHAIN_KHR = 1000001000;
    public static final int VK_OBJECT_TYPE_DISPLAY_KHR = 1000002000;
    public static final int VK_OBJECT_TYPE_DISPLAY_MODE_KHR = 1000002001;
    public static final int VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT = 1000011000;
    public static final int VK_OBJECT_TYPE_OBJECT_TABLE_NVX = 1000086000;
    public static final int VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX = 1000086001;
    public static final int VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT = 1000128000;
    public static final int VK_OBJECT_TYPE_VALIDATION_CACHE_EXT = 1000160000;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR = VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE;
    public static final int VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR = VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION;

    public VkObjectType() {
    }

    public VkObjectType(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkObjectType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkObjectType(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_OBJECT_TYPE_UNKNOWN) return "VK_OBJECT_TYPE_UNKNOWN";
        if(getValue() == VK_OBJECT_TYPE_INSTANCE) return "VK_OBJECT_TYPE_INSTANCE";
        if(getValue() == VK_OBJECT_TYPE_PHYSICAL_DEVICE) return "VK_OBJECT_TYPE_PHYSICAL_DEVICE";
        if(getValue() == VK_OBJECT_TYPE_DEVICE) return "VK_OBJECT_TYPE_DEVICE";
        if(getValue() == VK_OBJECT_TYPE_QUEUE) return "VK_OBJECT_TYPE_QUEUE";
        if(getValue() == VK_OBJECT_TYPE_SEMAPHORE) return "VK_OBJECT_TYPE_SEMAPHORE";
        if(getValue() == VK_OBJECT_TYPE_COMMAND_BUFFER) return "VK_OBJECT_TYPE_COMMAND_BUFFER";
        if(getValue() == VK_OBJECT_TYPE_FENCE) return "VK_OBJECT_TYPE_FENCE";
        if(getValue() == VK_OBJECT_TYPE_DEVICE_MEMORY) return "VK_OBJECT_TYPE_DEVICE_MEMORY";
        if(getValue() == VK_OBJECT_TYPE_BUFFER) return "VK_OBJECT_TYPE_BUFFER";
        if(getValue() == VK_OBJECT_TYPE_IMAGE) return "VK_OBJECT_TYPE_IMAGE";
        if(getValue() == VK_OBJECT_TYPE_EVENT) return "VK_OBJECT_TYPE_EVENT";
        if(getValue() == VK_OBJECT_TYPE_QUERY_POOL) return "VK_OBJECT_TYPE_QUERY_POOL";
        if(getValue() == VK_OBJECT_TYPE_BUFFER_VIEW) return "VK_OBJECT_TYPE_BUFFER_VIEW";
        if(getValue() == VK_OBJECT_TYPE_IMAGE_VIEW) return "VK_OBJECT_TYPE_IMAGE_VIEW";
        if(getValue() == VK_OBJECT_TYPE_SHADER_MODULE) return "VK_OBJECT_TYPE_SHADER_MODULE";
        if(getValue() == VK_OBJECT_TYPE_PIPELINE_CACHE) return "VK_OBJECT_TYPE_PIPELINE_CACHE";
        if(getValue() == VK_OBJECT_TYPE_PIPELINE_LAYOUT) return "VK_OBJECT_TYPE_PIPELINE_LAYOUT";
        if(getValue() == VK_OBJECT_TYPE_RENDER_PASS) return "VK_OBJECT_TYPE_RENDER_PASS";
        if(getValue() == VK_OBJECT_TYPE_PIPELINE) return "VK_OBJECT_TYPE_PIPELINE";
        if(getValue() == VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT) return "VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT";
        if(getValue() == VK_OBJECT_TYPE_SAMPLER) return "VK_OBJECT_TYPE_SAMPLER";
        if(getValue() == VK_OBJECT_TYPE_DESCRIPTOR_POOL) return "VK_OBJECT_TYPE_DESCRIPTOR_POOL";
        if(getValue() == VK_OBJECT_TYPE_DESCRIPTOR_SET) return "VK_OBJECT_TYPE_DESCRIPTOR_SET";
        if(getValue() == VK_OBJECT_TYPE_FRAMEBUFFER) return "VK_OBJECT_TYPE_FRAMEBUFFER";
        if(getValue() == VK_OBJECT_TYPE_COMMAND_POOL) return "VK_OBJECT_TYPE_COMMAND_POOL";
        if(getValue() == VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION) return "VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION";
        if(getValue() == VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE) return "VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE";
        if(getValue() == VK_OBJECT_TYPE_SURFACE_KHR) return "VK_OBJECT_TYPE_SURFACE_KHR";
        if(getValue() == VK_OBJECT_TYPE_SWAPCHAIN_KHR) return "VK_OBJECT_TYPE_SWAPCHAIN_KHR";
        if(getValue() == VK_OBJECT_TYPE_DISPLAY_KHR) return "VK_OBJECT_TYPE_DISPLAY_KHR";
        if(getValue() == VK_OBJECT_TYPE_DISPLAY_MODE_KHR) return "VK_OBJECT_TYPE_DISPLAY_MODE_KHR";
        if(getValue() == VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT) return "VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT";
        if(getValue() == VK_OBJECT_TYPE_OBJECT_TABLE_NVX) return "VK_OBJECT_TYPE_OBJECT_TABLE_NVX";
        if(getValue() == VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX) return "VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX";
        if(getValue() == VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT) return "VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT";
        if(getValue() == VK_OBJECT_TYPE_VALIDATION_CACHE_EXT) return "VK_OBJECT_TYPE_VALIDATION_CACHE_EXT";
        if(getValue() == VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR) return "VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR";
        if(getValue() == VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR) return "VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkObjectType implements cz.mg.collections.array.ReadonlyArray<VkObjectType> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkObjectType.sizeof()));
            this.count = count;
        }

        public Array(int count, VkObjectType o){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkObjectType get(int i){
            return new VkObjectType(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkObjectType.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
                this.count = count;
            }

            public Array(VkMemory vkmemory, int count) {
                super(vkmemory);
                this.count = count;
            }

            public Array(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress);
                this.count = count;
            }

            public Array(VkObjectType[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

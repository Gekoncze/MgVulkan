package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessageSeverityFlagBitsEXT.html">khronos documentation</a>
 **/
public class VkDebugUtilsMessageSeverityFlagBitsEXT extends VkFlagBits {
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT = 0x00000001;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT = 0x00000010;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT = 0x00000100;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT = 0x00001000;

    public VkDebugUtilsMessageSeverityFlagBitsEXT() {
    }

    public VkDebugUtilsMessageSeverityFlagBitsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugUtilsMessageSeverityFlagBitsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugUtilsMessageSeverityFlagBitsEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT) s += "VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT";
        if(getValue() == VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT) s += "VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT";
        if(getValue() == VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT) s += "VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT";
        if(getValue() == VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT) s += "VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkDebugUtilsMessageSeverityFlagBitsEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessageSeverityFlagBitsEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugUtilsMessageSeverityFlagBitsEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDebugUtilsMessageSeverityFlagBitsEXT o){
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
        public VkDebugUtilsMessageSeverityFlagBitsEXT get(int i){
            return new VkDebugUtilsMessageSeverityFlagBitsEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDebugUtilsMessageSeverityFlagBitsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessageSeverityFlagBitsEXT.Pointer> {
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

            public Array(VkDebugUtilsMessageSeverityFlagBitsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDebugUtilsMessageSeverityFlagBitsEXT.Pointer get(int i){
                return new VkDebugUtilsMessageSeverityFlagBitsEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

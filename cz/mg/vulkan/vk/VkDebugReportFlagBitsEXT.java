package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugReportFlagBitsEXT.html">khronos documentation</a>
 **/
public class VkDebugReportFlagBitsEXT extends VkFlagBits {
    public static final int VK_DEBUG_REPORT_INFORMATION_BIT_EXT = 0x00000001;
    public static final int VK_DEBUG_REPORT_WARNING_BIT_EXT = 0x00000002;
    public static final int VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = 0x00000004;
    public static final int VK_DEBUG_REPORT_ERROR_BIT_EXT = 0x00000008;
    public static final int VK_DEBUG_REPORT_DEBUG_BIT_EXT = 0x00000010;

    public VkDebugReportFlagBitsEXT() {
    }

    public VkDebugReportFlagBitsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugReportFlagBitsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugReportFlagBitsEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_DEBUG_REPORT_INFORMATION_BIT_EXT) s += "VK_DEBUG_REPORT_INFORMATION_BIT_EXT";
        if(getValue() == VK_DEBUG_REPORT_WARNING_BIT_EXT) s += "VK_DEBUG_REPORT_WARNING_BIT_EXT";
        if(getValue() == VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT) s += "VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT";
        if(getValue() == VK_DEBUG_REPORT_ERROR_BIT_EXT) s += "VK_DEBUG_REPORT_ERROR_BIT_EXT";
        if(getValue() == VK_DEBUG_REPORT_DEBUG_BIT_EXT) s += "VK_DEBUG_REPORT_DEBUG_BIT_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkDebugReportFlagBitsEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugReportFlagBitsEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugReportFlagBitsEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDebugReportFlagBitsEXT o){
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
        public VkDebugReportFlagBitsEXT get(int i){
            return new VkDebugReportFlagBitsEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDebugReportFlagBitsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkDebugReportFlagBitsEXT[] a) {
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

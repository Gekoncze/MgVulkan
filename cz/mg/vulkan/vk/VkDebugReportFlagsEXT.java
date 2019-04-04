package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugReportFlagsEXT.html">khronos documentation</a>
 **/
public class VkDebugReportFlagsEXT extends VkFlags {
    public VkDebugReportFlagsEXT() {
    }

    public VkDebugReportFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugReportFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugReportFlagsEXT(int value) {
        setValue(value);
    }

    public static class Array extends VkDebugReportFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugReportFlagsEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugReportFlagsEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDebugReportFlagsEXT o){
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
        public VkDebugReportFlagsEXT get(int i){
            return new VkDebugReportFlagsEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDebugReportFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDebugReportFlagsEXT.Pointer> {
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

            public Array(VkDebugReportFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDebugReportFlagsEXT.Pointer get(int i){
                return new VkDebugReportFlagsEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

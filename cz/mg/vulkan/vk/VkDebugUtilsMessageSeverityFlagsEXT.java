package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessageSeverityFlagsEXT.html">khronos documentation</a>
 **/
public class VkDebugUtilsMessageSeverityFlagsEXT extends VkFlags {
    public VkDebugUtilsMessageSeverityFlagsEXT() {
    }

    public VkDebugUtilsMessageSeverityFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugUtilsMessageSeverityFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugUtilsMessageSeverityFlagsEXT(int value) {
        setValue(value);
    }

    public static class Array extends VkDebugUtilsMessageSeverityFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessageSeverityFlagsEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugUtilsMessageSeverityFlagsEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDebugUtilsMessageSeverityFlagsEXT o){
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
        public VkDebugUtilsMessageSeverityFlagsEXT get(int i){
            return new VkDebugUtilsMessageSeverityFlagsEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDebugUtilsMessageSeverityFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessageSeverityFlagsEXT.Pointer> {
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

            public Array(VkDebugUtilsMessageSeverityFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDebugUtilsMessageSeverityFlagsEXT.Pointer get(int i){
                return new VkDebugUtilsMessageSeverityFlagsEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

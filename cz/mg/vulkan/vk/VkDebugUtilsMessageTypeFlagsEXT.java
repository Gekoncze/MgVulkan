package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessageTypeFlagsEXT.html">khronos documentation</a>
 **/
public class VkDebugUtilsMessageTypeFlagsEXT extends VkFlags {
    public VkDebugUtilsMessageTypeFlagsEXT() {
    }

    public VkDebugUtilsMessageTypeFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugUtilsMessageTypeFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugUtilsMessageTypeFlagsEXT(int value) {
        setValue(value);
    }

    public static class Array extends VkDebugUtilsMessageTypeFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessageTypeFlagsEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugUtilsMessageTypeFlagsEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDebugUtilsMessageTypeFlagsEXT o){
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
        public VkDebugUtilsMessageTypeFlagsEXT get(int i){
            return new VkDebugUtilsMessageTypeFlagsEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDebugUtilsMessageTypeFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessageTypeFlagsEXT.Pointer> {
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

            public Array(VkDebugUtilsMessageTypeFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDebugUtilsMessageTypeFlagsEXT.Pointer get(int i){
                return new VkDebugUtilsMessageTypeFlagsEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

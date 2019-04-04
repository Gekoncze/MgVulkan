package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessengerCreateFlagsEXT.html">khronos documentation</a>
 **/
public class VkDebugUtilsMessengerCreateFlagsEXT extends VkFlags {
    public VkDebugUtilsMessengerCreateFlagsEXT() {
    }

    public VkDebugUtilsMessengerCreateFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugUtilsMessengerCreateFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugUtilsMessengerCreateFlagsEXT(int value) {
        setValue(value);
    }

    public static class Array extends VkDebugUtilsMessengerCreateFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessengerCreateFlagsEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugUtilsMessengerCreateFlagsEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDebugUtilsMessengerCreateFlagsEXT o){
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
        public VkDebugUtilsMessengerCreateFlagsEXT get(int i){
            return new VkDebugUtilsMessengerCreateFlagsEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDebugUtilsMessengerCreateFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessengerCreateFlagsEXT.Pointer> {
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

            public Array(VkDebugUtilsMessengerCreateFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDebugUtilsMessengerCreateFlagsEXT.Pointer get(int i){
                return new VkDebugUtilsMessengerCreateFlagsEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

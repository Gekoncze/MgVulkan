package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessengerCallbackDataFlagsEXT.html">khronos documentation</a>
 **/
public class VkDebugUtilsMessengerCallbackDataFlagsEXT extends VkFlags {
    public VkDebugUtilsMessengerCallbackDataFlagsEXT() {
    }

    public VkDebugUtilsMessengerCallbackDataFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugUtilsMessengerCallbackDataFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugUtilsMessengerCallbackDataFlagsEXT(int value) {
        setValue(value);
    }

    public static class Array extends VkDebugUtilsMessengerCallbackDataFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessengerCallbackDataFlagsEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugUtilsMessengerCallbackDataFlagsEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDebugUtilsMessengerCallbackDataFlagsEXT o){
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
        public VkDebugUtilsMessengerCallbackDataFlagsEXT get(int i){
            return new VkDebugUtilsMessengerCallbackDataFlagsEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDebugUtilsMessengerCallbackDataFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessengerCallbackDataFlagsEXT.Pointer> {
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

            public Array(VkDebugUtilsMessengerCallbackDataFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDebugUtilsMessengerCallbackDataFlagsEXT.Pointer get(int i){
                return new VkDebugUtilsMessengerCallbackDataFlagsEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

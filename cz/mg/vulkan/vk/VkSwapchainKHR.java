package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSwapchainKHR.html">khronos documentation</a>
 **/
public class VkSwapchainKHR extends VkNonDispatchableHandle {
    public VkSwapchainKHR() {
    }

    public VkSwapchainKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSwapchainKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSwapchainKHR(long handle) {
        setValue(handle);
    }

    public static class Array extends VkSwapchainKHR implements cz.mg.collections.array.ReadonlyArray<VkSwapchainKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSwapchainKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSwapchainKHR o){
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
        public VkSwapchainKHR get(int i){
            return new VkSwapchainKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSwapchainKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSwapchainKHR.Pointer> {
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

            public Array(VkSwapchainKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSwapchainKHR.Pointer get(int i){
                return new VkSwapchainKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

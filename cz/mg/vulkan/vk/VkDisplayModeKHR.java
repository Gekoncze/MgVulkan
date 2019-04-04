package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayModeKHR.html">khronos documentation</a>
 **/
public class VkDisplayModeKHR extends VkNonDispatchableHandle {
    public VkDisplayModeKHR() {
    }

    public VkDisplayModeKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayModeKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDisplayModeKHR(long handle) {
        setValue(handle);
    }

    public static class Array extends VkDisplayModeKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayModeKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayModeKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDisplayModeKHR o){
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
        public VkDisplayModeKHR get(int i){
            return new VkDisplayModeKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDisplayModeKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDisplayModeKHR.Pointer> {
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

            public Array(VkDisplayModeKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDisplayModeKHR.Pointer get(int i){
                return new VkDisplayModeKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceQueueCreateFlags.html">khronos documentation</a>
 **/
public class VkDeviceQueueCreateFlags extends VkFlags {
    public VkDeviceQueueCreateFlags() {
    }

    public VkDeviceQueueCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceQueueCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDeviceQueueCreateFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkDeviceQueueCreateFlags implements cz.mg.collections.array.ReadonlyArray<VkDeviceQueueCreateFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceQueueCreateFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceQueueCreateFlags o){
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
        public VkDeviceQueueCreateFlags get(int i){
            return new VkDeviceQueueCreateFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceQueueCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceQueueCreateFlags.Pointer> {
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

            public Array(VkDeviceQueueCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceQueueCreateFlags.Pointer get(int i){
                return new VkDeviceQueueCreateFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

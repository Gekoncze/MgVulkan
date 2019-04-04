package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceCreateFlags.html">khronos documentation</a>
 **/
public class VkDeviceCreateFlags extends VkFlags {
    public VkDeviceCreateFlags() {
    }

    public VkDeviceCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDeviceCreateFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkDeviceCreateFlags implements cz.mg.collections.array.ReadonlyArray<VkDeviceCreateFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceCreateFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceCreateFlags o){
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
        public VkDeviceCreateFlags get(int i){
            return new VkDeviceCreateFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceCreateFlags.Pointer> {
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

            public Array(VkDeviceCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceCreateFlags.Pointer get(int i){
                return new VkDeviceCreateFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

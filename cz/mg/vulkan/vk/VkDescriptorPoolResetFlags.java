package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorPoolResetFlags.html">khronos documentation</a>
 **/
public class VkDescriptorPoolResetFlags extends VkFlags {
    public VkDescriptorPoolResetFlags() {
    }

    public VkDescriptorPoolResetFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorPoolResetFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDescriptorPoolResetFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkDescriptorPoolResetFlags implements cz.mg.collections.array.ReadonlyArray<VkDescriptorPoolResetFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorPoolResetFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorPoolResetFlags o){
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
        public VkDescriptorPoolResetFlags get(int i){
            return new VkDescriptorPoolResetFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDescriptorPoolResetFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDescriptorPoolResetFlags.Pointer> {
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

            public Array(VkDescriptorPoolResetFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDescriptorPoolResetFlags.Pointer get(int i){
                return new VkDescriptorPoolResetFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

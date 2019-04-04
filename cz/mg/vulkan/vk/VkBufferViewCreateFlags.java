package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferViewCreateFlags.html">khronos documentation</a>
 **/
public class VkBufferViewCreateFlags extends VkFlags {
    public VkBufferViewCreateFlags() {
    }

    public VkBufferViewCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferViewCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkBufferViewCreateFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkBufferViewCreateFlags implements cz.mg.collections.array.ReadonlyArray<VkBufferViewCreateFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBufferViewCreateFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkBufferViewCreateFlags o){
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
        public VkBufferViewCreateFlags get(int i){
            return new VkBufferViewCreateFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkBufferViewCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkBufferViewCreateFlags.Pointer> {
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

            public Array(VkBufferViewCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkBufferViewCreateFlags.Pointer get(int i){
                return new VkBufferViewCreateFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

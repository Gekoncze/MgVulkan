package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkIndexType.html">khronos documentation</a>
 **/
public class VkIndexType extends VkEnum {
    public static final int VK_INDEX_TYPE_UINT16 = 0;
    public static final int VK_INDEX_TYPE_UINT32 = 1;

    public VkIndexType() {
    }

    public VkIndexType(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkIndexType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkIndexType(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_INDEX_TYPE_UINT16) return "VK_INDEX_TYPE_UINT16";
        if(getValue() == VK_INDEX_TYPE_UINT32) return "VK_INDEX_TYPE_UINT32";
        return "UNKNOWN";
    }

    public static class Array extends VkIndexType implements cz.mg.collections.array.ReadonlyArray<VkIndexType> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkIndexType.sizeof()));
            this.count = count;
        }

        public Array(int count, VkIndexType o){
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
        public VkIndexType get(int i){
            return new VkIndexType(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkIndexType.Pointer implements cz.mg.collections.array.ReadonlyArray<VkIndexType.Pointer> {
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

            public Array(VkIndexType[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkIndexType.Pointer get(int i){
                return new VkIndexType.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

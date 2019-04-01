package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferCreateFlagBits.html">khronos documentation</a>
 **/
public class VkBufferCreateFlagBits extends VkFlagBits {
    public static final int VK_BUFFER_CREATE_SPARSE_BINDING_BIT = 0x00000001;
    public static final int VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = 0x00000002;
    public static final int VK_BUFFER_CREATE_SPARSE_ALIASED_BIT = 0x00000004;
    public static final int VK_BUFFER_CREATE_PROTECTED_BIT = 0x00000008;

    public VkBufferCreateFlagBits() {
    }

    public VkBufferCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkBufferCreateFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_BUFFER_CREATE_SPARSE_BINDING_BIT) s += "VK_BUFFER_CREATE_SPARSE_BINDING_BIT ";
        if(getValue() == VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT) s += "VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT ";
        if(getValue() == VK_BUFFER_CREATE_SPARSE_ALIASED_BIT) s += "VK_BUFFER_CREATE_SPARSE_ALIASED_BIT ";
        if(getValue() == VK_BUFFER_CREATE_PROTECTED_BIT) s += "VK_BUFFER_CREATE_PROTECTED_BIT ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkBufferCreateFlagBits implements cz.mg.collections.array.ReadonlyArray<VkBufferCreateFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBufferCreateFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkBufferCreateFlagBits o){
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
        public VkBufferCreateFlagBits get(int i){
            return new VkBufferCreateFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkBufferCreateFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkBufferCreateFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

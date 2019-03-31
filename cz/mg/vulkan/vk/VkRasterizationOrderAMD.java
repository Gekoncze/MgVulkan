package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkRasterizationOrderAMD.html">khronos documentation</a>
 **/
public class VkRasterizationOrderAMD extends VkEnum {
    public static final int VK_RASTERIZATION_ORDER_STRICT_AMD = 0;
    public static final int VK_RASTERIZATION_ORDER_RELAXED_AMD = 1;

    public VkRasterizationOrderAMD() {
    }

    public VkRasterizationOrderAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRasterizationOrderAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkRasterizationOrderAMD(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_RASTERIZATION_ORDER_STRICT_AMD) return "VK_RASTERIZATION_ORDER_STRICT_AMD";
        if(getValue() == VK_RASTERIZATION_ORDER_RELAXED_AMD) return "VK_RASTERIZATION_ORDER_RELAXED_AMD";
        return "UNKNOWN";
    }

    public static class Array extends VkRasterizationOrderAMD implements cz.mg.collections.array.ReadonlyArray<VkRasterizationOrderAMD> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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
        public VkRasterizationOrderAMD get(int i){
            return new VkRasterizationOrderAMD(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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

            public Array(VkRasterizationOrderAMD[] a) {
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

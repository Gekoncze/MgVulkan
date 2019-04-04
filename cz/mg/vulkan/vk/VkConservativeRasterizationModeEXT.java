package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkConservativeRasterizationModeEXT.html">khronos documentation</a>
 **/
public class VkConservativeRasterizationModeEXT extends VkEnum {
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT = 0;
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT = 1;
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT = 2;

    public VkConservativeRasterizationModeEXT() {
    }

    public VkConservativeRasterizationModeEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkConservativeRasterizationModeEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkConservativeRasterizationModeEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT) return "VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT";
        if(getValue() == VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT) return "VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT";
        if(getValue() == VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT) return "VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VkConservativeRasterizationModeEXT implements cz.mg.collections.array.ReadonlyArray<VkConservativeRasterizationModeEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkConservativeRasterizationModeEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkConservativeRasterizationModeEXT o){
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
        public VkConservativeRasterizationModeEXT get(int i){
            return new VkConservativeRasterizationModeEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkConservativeRasterizationModeEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkConservativeRasterizationModeEXT.Pointer> {
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

            public Array(VkConservativeRasterizationModeEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkConservativeRasterizationModeEXT.Pointer get(int i){
                return new VkConservativeRasterizationModeEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

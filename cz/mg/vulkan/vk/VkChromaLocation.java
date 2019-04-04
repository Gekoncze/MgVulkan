package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkChromaLocation.html">khronos documentation</a>
 **/
public class VkChromaLocation extends VkEnum {
    public static final int VK_CHROMA_LOCATION_COSITED_EVEN = 0;
    public static final int VK_CHROMA_LOCATION_MIDPOINT = 1;
    public static final int VK_CHROMA_LOCATION_COSITED_EVEN_KHR = VK_CHROMA_LOCATION_COSITED_EVEN;
    public static final int VK_CHROMA_LOCATION_MIDPOINT_KHR = VK_CHROMA_LOCATION_MIDPOINT;

    public VkChromaLocation() {
    }

    public VkChromaLocation(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkChromaLocation(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkChromaLocation(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_CHROMA_LOCATION_COSITED_EVEN) return "VK_CHROMA_LOCATION_COSITED_EVEN";
        if(getValue() == VK_CHROMA_LOCATION_MIDPOINT) return "VK_CHROMA_LOCATION_MIDPOINT";
        if(getValue() == VK_CHROMA_LOCATION_COSITED_EVEN_KHR) return "VK_CHROMA_LOCATION_COSITED_EVEN_KHR";
        if(getValue() == VK_CHROMA_LOCATION_MIDPOINT_KHR) return "VK_CHROMA_LOCATION_MIDPOINT_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkChromaLocation implements cz.mg.collections.array.ReadonlyArray<VkChromaLocation> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkChromaLocation.sizeof()));
            this.count = count;
        }

        public Array(int count, VkChromaLocation o){
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
        public VkChromaLocation get(int i){
            return new VkChromaLocation(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkChromaLocation.Pointer implements cz.mg.collections.array.ReadonlyArray<VkChromaLocation.Pointer> {
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

            public Array(VkChromaLocation[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkChromaLocation.Pointer get(int i){
                return new VkChromaLocation.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}

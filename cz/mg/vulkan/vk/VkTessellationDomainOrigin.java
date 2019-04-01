package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkTessellationDomainOrigin.html">khronos documentation</a>
 **/
public class VkTessellationDomainOrigin extends VkEnum {
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT = 0;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT = 1;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR = VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR = VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT;

    public VkTessellationDomainOrigin() {
    }

    public VkTessellationDomainOrigin(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkTessellationDomainOrigin(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkTessellationDomainOrigin(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT) return "VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT";
        if(getValue() == VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT) return "VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT";
        if(getValue() == VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR) return "VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR";
        if(getValue() == VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR) return "VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkTessellationDomainOrigin implements cz.mg.collections.array.ReadonlyArray<VkTessellationDomainOrigin> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkTessellationDomainOrigin.sizeof()));
            this.count = count;
        }

        public Array(int count, VkTessellationDomainOrigin o){
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
        public VkTessellationDomainOrigin get(int i){
            return new VkTessellationDomainOrigin(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkTessellationDomainOrigin.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkTessellationDomainOrigin[] a) {
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

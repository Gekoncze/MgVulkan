package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryFeatureFlagBitsNV.html">khronos documentation</a>
 **/
public class VkExternalMemoryFeatureFlagBitsNV extends VkFlagBits {
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV = 0x00000001;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV = 0x00000002;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV = 0x00000004;

    public VkExternalMemoryFeatureFlagBitsNV() {
    }

    public VkExternalMemoryFeatureFlagBitsNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalMemoryFeatureFlagBitsNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkExternalMemoryFeatureFlagBitsNV(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV) s += "VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV ";
        if(getValue() == VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV) s += "VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV ";
        if(getValue() == VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV) s += "VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkExternalMemoryFeatureFlagBitsNV implements cz.mg.collections.array.ReadonlyArray<VkExternalMemoryFeatureFlagBitsNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalMemoryFeatureFlagBitsNV.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExternalMemoryFeatureFlagBitsNV o){
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
        public VkExternalMemoryFeatureFlagBitsNV get(int i){
            return new VkExternalMemoryFeatureFlagBitsNV(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkExternalMemoryFeatureFlagBitsNV.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkExternalMemoryFeatureFlagBitsNV[] a) {
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

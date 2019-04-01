package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryFeatureFlagBits.html">khronos documentation</a>
 **/
public class VkExternalMemoryFeatureFlagBits extends VkFlagBits {
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT = 0x00000001;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT = 0x00000002;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT = 0x00000004;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHR = VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHR = VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHR = VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT;

    public VkExternalMemoryFeatureFlagBits() {
    }

    public VkExternalMemoryFeatureFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalMemoryFeatureFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkExternalMemoryFeatureFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT) s += "VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT ";
        if(getValue() == VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT) s += "VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT ";
        if(getValue() == VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT) s += "VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT ";
        if(getValue() == VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHR) s += "VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHR ";
        if(getValue() == VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHR) s += "VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHR ";
        if(getValue() == VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHR) s += "VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHR ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkExternalMemoryFeatureFlagBits implements cz.mg.collections.array.ReadonlyArray<VkExternalMemoryFeatureFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalMemoryFeatureFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExternalMemoryFeatureFlagBits o){
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
        public VkExternalMemoryFeatureFlagBits get(int i){
            return new VkExternalMemoryFeatureFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkExternalMemoryFeatureFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkExternalMemoryFeatureFlagBits[] a) {
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

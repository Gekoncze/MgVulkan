package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalFenceFeatureFlagBits.html">khronos documentation</a>
 **/
public class VkExternalFenceFeatureFlagBits extends VkFlagBits {
    public static final int VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT = 0x00000001;
    public static final int VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT = 0x00000002;
    public static final int VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR = VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT;
    public static final int VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR = VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT;

    public VkExternalFenceFeatureFlagBits() {
    }

    public VkExternalFenceFeatureFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalFenceFeatureFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkExternalFenceFeatureFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT) s += "VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT ";
        if(getValue() == VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT) s += "VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT ";
        if(getValue() == VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR) s += "VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR ";
        if(getValue() == VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR) s += "VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkExternalFenceFeatureFlagBits implements cz.mg.collections.array.ReadonlyArray<VkExternalFenceFeatureFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalFenceFeatureFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExternalFenceFeatureFlagBits o){
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
        public VkExternalFenceFeatureFlagBits get(int i){
            return new VkExternalFenceFeatureFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkExternalFenceFeatureFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkExternalFenceFeatureFlagBits[] a) {
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

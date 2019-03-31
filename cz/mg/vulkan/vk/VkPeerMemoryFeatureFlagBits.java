package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPeerMemoryFeatureFlagBits.html">khronos documentation</a>
 **/
public class VkPeerMemoryFeatureFlagBits extends VkFlagBits {
    public static final int VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT = 0x00000001;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_DST_BIT = 0x00000002;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT = 0x00000004;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT = 0x00000008;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR = VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR = VK_PEER_MEMORY_FEATURE_COPY_DST_BIT;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR = VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR = VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT;

    public VkPeerMemoryFeatureFlagBits() {
    }

    public VkPeerMemoryFeatureFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPeerMemoryFeatureFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPeerMemoryFeatureFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT) s += "VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT ";
        if(getValue() == VK_PEER_MEMORY_FEATURE_COPY_DST_BIT) s += "VK_PEER_MEMORY_FEATURE_COPY_DST_BIT ";
        if(getValue() == VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT) s += "VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT ";
        if(getValue() == VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT) s += "VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT ";
        if(getValue() == VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR) s += "VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR ";
        if(getValue() == VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR) s += "VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR ";
        if(getValue() == VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR) s += "VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR ";
        if(getValue() == VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR) s += "VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkPeerMemoryFeatureFlagBits implements cz.mg.collections.array.ReadonlyArray<VkPeerMemoryFeatureFlagBits> {
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
        public VkPeerMemoryFeatureFlagBits get(int i){
            return new VkPeerMemoryFeatureFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkPeerMemoryFeatureFlagBits[] a) {
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

package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

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

    protected VkPeerMemoryFeatureFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPeerMemoryFeatureFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPeerMemoryFeatureFlagBits(VkPointer pointer) {
        super(pointer);
    }



    public VkPeerMemoryFeatureFlagBits(int value) {
        setValue(value);
    }

    public VkPeerMemoryFeatureFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT) != 0) s.addLast("VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT");
        if((getValue() & VK_PEER_MEMORY_FEATURE_COPY_DST_BIT) != 0) s.addLast("VK_PEER_MEMORY_FEATURE_COPY_DST_BIT");
        if((getValue() & VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT) != 0) s.addLast("VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT");
        if((getValue() & VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT) != 0) s.addLast("VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT");
        if((getValue() & VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR) != 0) s.addLast("VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR");
        if((getValue() & VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR) != 0) s.addLast("VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR");
        if((getValue() & VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR) != 0) s.addLast("VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR");
        if((getValue() & VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR) != 0) s.addLast("VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

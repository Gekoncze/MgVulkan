package cz.mg.vulkan;

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
        if(getValue() == VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT) s += "VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT";
        if(getValue() == VK_PEER_MEMORY_FEATURE_COPY_DST_BIT) s += "VK_PEER_MEMORY_FEATURE_COPY_DST_BIT";
        if(getValue() == VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT) s += "VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT";
        if(getValue() == VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT) s += "VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT";
        if(getValue() == VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR) s += "VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR";
        if(getValue() == VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR) s += "VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR";
        if(getValue() == VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR) s += "VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR";
        if(getValue() == VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR) s += "VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

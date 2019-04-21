package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkPeerMemoryFeatureFlagBitsKHX extends VkFlagBits {
    public static final int VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHX = 0x00000001;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHX = 0x00000002;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHX = 0x00000004;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHX = 0x00000008;

    public VkPeerMemoryFeatureFlagBitsKHX() {
    }

    public VkPeerMemoryFeatureFlagBitsKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPeerMemoryFeatureFlagBitsKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkPeerMemoryFeatureFlagBitsKHX(int value) {
        setValue(value);
    }

    public VkPeerMemoryFeatureFlagBitsKHX(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHX) != 0) s.addLast("VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHX");
        if((getValue() & VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHX) != 0) s.addLast("VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHX");
        if((getValue() & VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHX) != 0) s.addLast("VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHX");
        if((getValue() & VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHX) != 0) s.addLast("VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHX");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

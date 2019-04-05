package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPeerMemoryFeatureFlagBits extends VulkanFlagBits {
    public static final int COPY_SRC = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT;
    public static final int COPY_DST = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_COPY_DST_BIT;
    public static final int GENERIC_SRC = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT;
    public static final int GENERIC_DST = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT;
    public static final int COPY_SRC_KHR = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR;
    public static final int COPY_DST_KHR = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR;
    public static final int GENERIC_SRC_KHR = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR;
    public static final int GENERIC_DST_KHR = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR;

    public VulkanPeerMemoryFeatureFlagBits(){
        super(new VkPeerMemoryFeatureFlagBits());
    }

    public VulkanPeerMemoryFeatureFlagBits(VkPeerMemoryFeatureFlagBits vk){
        super(vk);
    }

    @Override
    public VkPeerMemoryFeatureFlagBits getVk(){
        return (VkPeerMemoryFeatureFlagBits) super.getVk();
    }

    public VulkanPeerMemoryFeatureFlagBits(int value){
        super(new VkPeerMemoryFeatureFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == COPY_SRC) s += "COPY_SRC";
        if(getValue() == COPY_DST) s += "COPY_DST";
        if(getValue() == GENERIC_SRC) s += "GENERIC_SRC";
        if(getValue() == GENERIC_DST) s += "GENERIC_DST";
        if(getValue() == COPY_SRC_KHR) s += "COPY_SRC_KHR";
        if(getValue() == COPY_DST_KHR) s += "COPY_DST_KHR";
        if(getValue() == GENERIC_SRC_KHR) s += "GENERIC_SRC_KHR";
        if(getValue() == GENERIC_DST_KHR) s += "GENERIC_DST_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}

package cz.mg.vulkan.vk;

public class VkPeerMemoryFeatureFlags extends VkFlags {
    public VkPeerMemoryFeatureFlags() {
    }

    public VkPeerMemoryFeatureFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPeerMemoryFeatureFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPeerMemoryFeatureFlags(int value) {
        setValue(value);
    }
}

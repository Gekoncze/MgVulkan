package cz.mg.vulkan;

public class VkPeerMemoryFeatureFlags extends VkFlags {
    public VkPeerMemoryFeatureFlags() {
    }

    protected VkPeerMemoryFeatureFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPeerMemoryFeatureFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPeerMemoryFeatureFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkPeerMemoryFeatureFlags(int value) {
        setValue(value);
    }
}

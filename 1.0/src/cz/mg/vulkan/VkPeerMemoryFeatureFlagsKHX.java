package cz.mg.vulkan;

public class VkPeerMemoryFeatureFlagsKHX extends VkFlags {
    public VkPeerMemoryFeatureFlagsKHX() {
    }

    public VkPeerMemoryFeatureFlagsKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPeerMemoryFeatureFlagsKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkPeerMemoryFeatureFlagsKHX(int value) {
        setValue(value);
    }
}

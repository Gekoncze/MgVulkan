package cz.mg.vulkan;

public class VkPeerMemoryFeatureFlagsKHX extends VkFlags {
    public VkPeerMemoryFeatureFlagsKHX() {
    }

    protected VkPeerMemoryFeatureFlagsKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPeerMemoryFeatureFlagsKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPeerMemoryFeatureFlagsKHX(VkPointer pointer) {
        super(pointer);
    }



    public VkPeerMemoryFeatureFlagsKHX(int value) {
        setValue(value);
    }
}

package cz.mg.vulkan.vk;

public class VkExternalMemoryFeatureFlagsNV extends VkFlags {
    public VkExternalMemoryFeatureFlagsNV() {
    }

    public VkExternalMemoryFeatureFlagsNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalMemoryFeatureFlagsNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkExternalMemoryFeatureFlagsNV(int value) {
        setValue(value);
    }
}

package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkMemoryHeapFlags;


public class VulkanMemoryHeapFlags {
    private final VkMemoryHeapFlags flags;

    public VulkanMemoryHeapFlags(VkMemoryHeapFlags flags) {
        this.flags = flags;
    }

    public boolean isVkMemoryHeapDeviceLocalBit(){
        return (flags.value & VkMemoryHeapFlags.VK_MEMORY_HEAP_DEVICE_LOCAL_BIT) != 0;
    }

    public boolean isVkMemoryHeapMultiInstanceBitKhx(){
        return (flags.value & VkMemoryHeapFlags.VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX) != 0;
    }
}

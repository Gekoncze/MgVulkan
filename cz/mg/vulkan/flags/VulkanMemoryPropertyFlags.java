package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkMemoryPropertyFlags;


public class VulkanMemoryPropertyFlags {
    private final VkMemoryPropertyFlags flags;

    public VulkanMemoryPropertyFlags(VkMemoryPropertyFlags flags) {
        this.flags = flags;
    }

    public boolean isVkMemoryPropertyDeviceLocalBit(){
        return (flags.value & VkMemoryPropertyFlags.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT) != 0;
    }

    public boolean isVkMemoryPropertyHostVisibleBit(){
        return (flags.value & VkMemoryPropertyFlags.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT) != 0;
    }

    public boolean isVkMemoryPropertyHostCoherentBit(){
        return (flags.value & VkMemoryPropertyFlags.VK_MEMORY_PROPERTY_HOST_COHERENT_BIT) != 0;
    }

    public boolean isVkMemoryPropertyHostCachedBit(){
        return (flags.value & VkMemoryPropertyFlags.VK_MEMORY_PROPERTY_HOST_CACHED_BIT) != 0;
    }

    public boolean isVkMemoryPropertyLazilyAllocatedBit(){
        return (flags.value & VkMemoryPropertyFlags.VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT) != 0;
    }
}

package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkQueueFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanQueueFlags {
    private final VkQueueFlags flags;

    public VulkanQueueFlags(VkQueueFlags flags) {
        this.flags = flags;
    }

    public boolean isVkQueueGraphicsBit(){
        return (flags.value & VkQueueFlags.VK_QUEUE_GRAPHICS_BIT) != 0;
    }

    public boolean isVkQueueComputeBit(){
        return (flags.value & VkQueueFlags.VK_QUEUE_COMPUTE_BIT) != 0;
    }

    public boolean isVkQueueTransferBit(){
        return (flags.value & VkQueueFlags.VK_QUEUE_TRANSFER_BIT) != 0;
    }

    public boolean isVkQueueSparseBindingBit(){
        return (flags.value & VkQueueFlags.VK_QUEUE_SPARSE_BINDING_BIT) != 0;
    }

    @Override
    public String toString() {
        return ToString.flagsToStringNoLabels(flags.value, VkQueueFlags.class);
    }
}

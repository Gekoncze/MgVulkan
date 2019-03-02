package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkQueueFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanQueueFlags {
    public static final int GRAPHICS = VkQueueFlags.VK_QUEUE_GRAPHICS_BIT;
    public static final int COMPUTE = VkQueueFlags.VK_QUEUE_COMPUTE_BIT;
    public static final int TRANSFER = VkQueueFlags.VK_QUEUE_TRANSFER_BIT;
    public static final int SPARSE_BINDING = VkQueueFlags.VK_QUEUE_SPARSE_BINDING_BIT;

    public final VkQueueFlags flags;

    public VulkanQueueFlags() {
        this(0);
    }

    public VulkanQueueFlags(int flag){
        this(new VkQueueFlags(flag));
    }

    public VulkanQueueFlags(VkQueueFlags flags) {
        this.flags = flags;
    }

    public boolean isSet(int flag){
        return (flags.value & flag) != 0;
    }

    public void set(int flag){
        flags.value |= flag;
    }

    @Override
    public String toString() {
        return ToString.flagsToStringNoLabels(flags.value, VkQueueFlags.class);
    }
}

package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkMemoryPropertyFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanMemoryPropertyFlags {
    public static final int DEVICE_LOCAL = VkMemoryPropertyFlags.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT;
    public static final int HOST_VISIBLE = VkMemoryPropertyFlags.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT;
    public static final int HOST_COHERENT = VkMemoryPropertyFlags.VK_MEMORY_PROPERTY_HOST_COHERENT_BIT;
    public static final int HOST_CACHED = VkMemoryPropertyFlags.VK_MEMORY_PROPERTY_HOST_CACHED_BIT;
    public static final int LAZILY_ALLOCATED = VkMemoryPropertyFlags.VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT;

    public final VkMemoryPropertyFlags flags;

    public VulkanMemoryPropertyFlags() {
        this(0);
    }

    public VulkanMemoryPropertyFlags(int flag){
        this(new VkMemoryPropertyFlags(flag));
    }

    public VulkanMemoryPropertyFlags(VkMemoryPropertyFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkMemoryPropertyFlags.class);
    }
}

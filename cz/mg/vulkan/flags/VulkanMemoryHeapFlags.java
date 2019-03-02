package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkMemoryHeapFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanMemoryHeapFlags {
    public static final int DEVICE_LOCAL = VkMemoryHeapFlags.VK_MEMORY_HEAP_DEVICE_LOCAL_BIT;
    public static final int MULTI_INSTANCE = VkMemoryHeapFlags.VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX;

    private final VkMemoryHeapFlags flags;

    public VulkanMemoryHeapFlags(int flag){
        this.flags = new VkMemoryHeapFlags(flag);
    }

    public VulkanMemoryHeapFlags(VkMemoryHeapFlags flags) {
        this.flags = flags;
    }

    public VkMemoryHeapFlags getFlags() {
        return flags;
    }

    public boolean isSet(int flag){
        return (flags.value & flag) != 0;
    }

    public void set(int flag){
        flags.value |= flag;
    }

    @Override
    public String toString() {
        return ToString.flagsToStringNoLabels(flags.value, VkMemoryHeapFlags.class);
    }
}

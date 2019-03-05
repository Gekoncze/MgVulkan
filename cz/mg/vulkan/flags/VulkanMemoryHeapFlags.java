package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkMemoryHeapFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanMemoryHeapFlags {
    public static final int DEVICE_LOCAL = VkMemoryHeapFlags.VK_MEMORY_HEAP_DEVICE_LOCAL_BIT;
    public static final int MULTI_INSTANCE_KHX = VkMemoryHeapFlags.VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX;

    public final VkMemoryHeapFlags flags;

    public VulkanMemoryHeapFlags(){
        this(0);
    }

    public VulkanMemoryHeapFlags(int flag){
        this(new VkMemoryHeapFlags(flag));
    }

    public VulkanMemoryHeapFlags(VkMemoryHeapFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkMemoryHeapFlags.class);
    }
}

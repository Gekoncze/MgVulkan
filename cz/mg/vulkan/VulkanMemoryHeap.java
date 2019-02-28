package cz.mg.vulkan;

import cz.mg.vulkan.flags.VulkanMemoryHeapFlags;
import cz.mg.vulkan.jna.structures.VkMemoryHeap;


public class VulkanMemoryHeap {
    private final VkMemoryHeap structure;

    public VulkanMemoryHeap(VkMemoryHeap structure) {
        this.structure = structure;
    }

    public long getSize(){
        return structure.size.longValue();
    }

    public VulkanMemoryHeapFlags getFlags(){
        return new VulkanMemoryHeapFlags(structure.flags);
    }
}

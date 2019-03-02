package cz.mg.vulkan.structures;

import cz.mg.vulkan.flags.VulkanMemoryHeapFlags;
import cz.mg.vulkan.jna.structures.VkMemoryHeap;


public class VulkanMemoryHeap {
    public final VkMemoryHeap structure;

    public VulkanMemoryHeap() {
        this(new VkMemoryHeap());
    }

    public VulkanMemoryHeap(VkMemoryHeap structure) {
        if(structure == null) throw new IllegalArgumentException();
        this.structure = structure;
    }

    public long getSize(){
        return structure.size.longValue();
    }

    public VulkanMemoryHeapFlags getFlags(){
        return new VulkanMemoryHeapFlags(structure.flags);
    }
}

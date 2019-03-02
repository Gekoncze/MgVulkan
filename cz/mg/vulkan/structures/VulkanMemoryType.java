package cz.mg.vulkan.structures;

import cz.mg.vulkan.flags.VulkanMemoryPropertyFlags;
import cz.mg.vulkan.jna.structures.VkMemoryType;


public class VulkanMemoryType {
    public final VkMemoryType structure;

    public VulkanMemoryType() {
        this.structure = new VkMemoryType();
    }

    public VulkanMemoryType(VkMemoryType structure) {
        this.structure = structure;
    }

    public VulkanMemoryPropertyFlags getPropertyFlags(){
        return new VulkanMemoryPropertyFlags(structure.propertyFlags);
    }

    public int getHeapIndex(){
        return structure.heapIndex.intValue();
    }
}

package cz.mg.vulkan;

import cz.mg.vulkan.flags.VulkanMemoryPropertyFlags;
import cz.mg.vulkan.jna.structures.VkMemoryType;


public class VulkanMemoryType {
    private final VkMemoryType structure;

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

package cz.mg.vulkan;

import cz.mg.vulkan.jna.structures.VkPhysicalDeviceMemoryProperties;


public class VulkanPhysicalDeviceMemoryProperties {
    private final VkPhysicalDeviceMemoryProperties structure;

    public VulkanPhysicalDeviceMemoryProperties(VkPhysicalDeviceMemoryProperties structure) {
        this.structure = structure;
    }

    public int getMemoryTypeCount(){
        return structure.memoryTypeCount.intValue();
    }

    public VulkanMemoryType[] getMemoryTypes(){
        VulkanMemoryType[] array = new VulkanMemoryType[getMemoryTypeCount()];
        for(int i = 0; i < array.length; i++) array[i] = new VulkanMemoryType(structure.memoryTypes[i]);
        return array;
    }

    public int getMemoryHeapCount(){
        return structure.memoryHeapCount.intValue();
    }

    public VulkanMemoryHeap[] getMemoryHeaps(){
        VulkanMemoryHeap[] array = new VulkanMemoryHeap[getMemoryHeapCount()];
        for(int i = 0; i < array.length; i++) array[i] = new VulkanMemoryHeap(structure.memoryHeaps[i]);
        return array;
    }
}

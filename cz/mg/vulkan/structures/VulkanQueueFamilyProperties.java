package cz.mg.vulkan.structures;

import cz.mg.vulkan.flags.VulkanQueueFlags;
import cz.mg.vulkan.jna.structures.VkQueueFamilyProperties;
import cz.mg.vulkan.structures.VulkanExtent3D;


public class VulkanQueueFamilyProperties {
    public final VkQueueFamilyProperties structure;

    public VulkanQueueFamilyProperties(VkQueueFamilyProperties structure) {
        this.structure = structure;
    }

    public VulkanQueueFlags getQueueFlags(){
        return new VulkanQueueFlags(structure.queueFlags);
    }

    public int getQueueCount(){
        return structure.queueCount.intValue();
    }

    public int getTimestampValidBits(){
        return structure.timestampValidBits.intValue();
    }

    public VulkanExtent3D getMinImageTransferGranularity(){
        return new VulkanExtent3D(structure.minImageTransferGranularity);
    }
}

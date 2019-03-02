package cz.mg.vulkan.structures;

import cz.mg.vulkan.jna.structures.VkExtent3D;


public class VulkanExtent3D {
    public final VkExtent3D structure;

    public VulkanExtent3D(VkExtent3D structure) {
        this.structure = structure;
    }

    public int getWidth(){
        return structure.width.intValue();
    }

    public int getHeight(){
        return structure.height.intValue();
    }

    public int getDepth(){
        return structure.depth.intValue();
    }
}

package cz.mg.vulkan.structures;

import cz.mg.vulkan.enums.*;
import cz.mg.vulkan.jna.structures.*;


public class VulkanComponentMapping {
    public final VkComponentMapping structure;

    public VulkanComponentMapping() {
        this.structure = new VkComponentMapping();
    }

    public VulkanComponentMapping(VkComponentMapping structure) {
        this.structure = structure;
    }

    public VulkanComponentSwizzle getR(){
        return new VulkanComponentSwizzle(structure.r);
    }

    public VulkanComponentSwizzle getG(){
        return new VulkanComponentSwizzle(structure.g);
    }

    public VulkanComponentSwizzle getB(){
        return new VulkanComponentSwizzle(structure.b);
    }

    public VulkanComponentSwizzle getA(){
        return new VulkanComponentSwizzle(structure.a);
    }
}

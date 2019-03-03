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
        return VulkanComponentSwizzle.fromNativeEnum(structure.r);
    }

    public VulkanComponentSwizzle getG(){
        return VulkanComponentSwizzle.fromNativeEnum(structure.g);
    }

    public VulkanComponentSwizzle getB(){
        return VulkanComponentSwizzle.fromNativeEnum(structure.b);
    }

    public VulkanComponentSwizzle getA(){
        return VulkanComponentSwizzle.fromNativeEnum(structure.a);
    }
}

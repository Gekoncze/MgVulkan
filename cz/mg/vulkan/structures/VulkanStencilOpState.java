package cz.mg.vulkan.structures;

import cz.mg.vulkan.enums.*;
import cz.mg.vulkan.flags.*;
import cz.mg.vulkan.jna.structures.*;
import static cz.mg.vulkan.jna.Vk.*;


public class VulkanStencilOpState {
    public final VkStencilOpState structure;

    public VulkanStencilOpState() {
        this.structure = new VkStencilOpState();
    }

    public VulkanStencilOpState(VkStencilOpState structure) {
        this.structure = structure;
    }

    public VulkanStencilOp getFailOp(){
        return new VulkanStencilOp(structure.failOp);
    }

    public VulkanStencilOp getPassOp(){
        return new VulkanStencilOp(structure.passOp);
    }

    public VulkanStencilOp getDepthFailOp(){
        return new VulkanStencilOp(structure.depthFailOp);
    }

    public VulkanCompareOp getCompareOp(){
        return new VulkanCompareOp(structure.compareOp);
    }

    public int getCompareMask(){
        return structure.compareMask.intValue();
    }

    public int getWriteMask(){
        return structure.writeMask.intValue();
    }

    public int getReference(){
        return structure.reference.intValue();
    }
}

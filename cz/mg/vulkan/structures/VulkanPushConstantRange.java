package cz.mg.vulkan.structures;

import cz.mg.vulkan.enums.*;
import cz.mg.vulkan.flags.*;
import cz.mg.vulkan.jna.structures.*;
import static cz.mg.vulkan.jna.Vk.*;


public class VulkanPushConstantRange {
    public final VkPushConstantRange structure;

    public VulkanPushConstantRange() {
        this.structure = new VkPushConstantRange();
    }

    public VulkanPushConstantRange(VkPushConstantRange structure) {
        this.structure = structure;
    }

    public VulkanShaderStageFlags getStageFlags(){
        return new VulkanShaderStageFlags(structure.stageFlags);
    }

    public int getOffset(){
        return structure.offset.intValue();
    }

    public int getSize(){
        return structure.size.intValue();
    }
}

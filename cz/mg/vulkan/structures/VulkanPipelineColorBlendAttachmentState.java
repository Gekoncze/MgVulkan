package cz.mg.vulkan.structures;

import cz.mg.vulkan.enums.*;
import cz.mg.vulkan.flags.*;
import cz.mg.vulkan.jna.structures.*;
import static cz.mg.vulkan.jna.Vk.*;


public class VulkanPipelineColorBlendAttachmentState {
    public final VkPipelineColorBlendAttachmentState structure;

    public VulkanPipelineColorBlendAttachmentState() {
        this.structure = new VkPipelineColorBlendAttachmentState();
    }

    public VulkanPipelineColorBlendAttachmentState(VkPipelineColorBlendAttachmentState structure) {
        this.structure = structure;
    }

    public boolean isBlendEnable(){
        return structure.blendEnable.intValue() == VK_FALSE ? false : true;
    }

    public VulkanBlendFactor getSrcColorBlendFactor(){
        return new VulkanBlendFactor(structure.srcColorBlendFactor);
    }

    public VulkanBlendFactor getDstColorBlendFactor(){
        return new VulkanBlendFactor(structure.dstColorBlendFactor);
    }

    public VulkanBlendOp getColorBlendOp(){
        return new VulkanBlendOp(structure.colorBlendOp);
    }

    public VulkanBlendFactor getSrcAlphaBlendFactor(){
        return new VulkanBlendFactor(structure.srcAlphaBlendFactor);
    }

    public VulkanBlendFactor getDstAlphaBlendFactor(){
        return new VulkanBlendFactor(structure.dstAlphaBlendFactor);
    }

    public VulkanBlendOp getAlphaBlendOp(){
        return new VulkanBlendOp(structure.alphaBlendOp);
    }

    public VulkanColorComponentFlags getColorWriteMask(){
        return new VulkanColorComponentFlags(structure.colorWriteMask);
    }
}

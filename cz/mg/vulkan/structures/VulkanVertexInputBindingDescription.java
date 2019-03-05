package cz.mg.vulkan.structures;

import cz.mg.vulkan.enums.*;
import cz.mg.vulkan.flags.*;
import cz.mg.vulkan.jna.structures.*;
import static cz.mg.vulkan.jna.Vk.*;


public class VulkanVertexInputBindingDescription {
    public final VkVertexInputBindingDescription structure;

    public VulkanVertexInputBindingDescription() {
        this.structure = new VkVertexInputBindingDescription();
    }

    public VulkanVertexInputBindingDescription(VkVertexInputBindingDescription structure) {
        this.structure = structure;
    }

    public int getBinding(){
        return structure.binding.intValue();
    }

    public int getStride(){
        return structure.stride.intValue();
    }

    public VulkanVertexInputRate getInputRate(){
        return new VulkanVertexInputRate(structure.inputRate);
    }
}

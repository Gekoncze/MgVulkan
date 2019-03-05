package cz.mg.vulkan.structures;

import cz.mg.vulkan.enums.*;
import cz.mg.vulkan.flags.*;
import cz.mg.vulkan.jna.structures.*;
import static cz.mg.vulkan.jna.Vk.*;


public class VulkanVertexInputAttributeDescription {
    public final VkVertexInputAttributeDescription structure;

    public VulkanVertexInputAttributeDescription() {
        this.structure = new VkVertexInputAttributeDescription();
    }

    public VulkanVertexInputAttributeDescription(VkVertexInputAttributeDescription structure) {
        this.structure = structure;
    }

    public int getLocation(){
        return structure.location.intValue();
    }

    public int getBinding(){
        return structure.binding.intValue();
    }

    public VulkanFormat getFormat(){
        return new VulkanFormat(structure.format);
    }

    public int getOffset(){
        return structure.offset.intValue();
    }
}

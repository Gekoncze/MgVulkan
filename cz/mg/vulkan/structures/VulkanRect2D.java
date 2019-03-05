package cz.mg.vulkan.structures;

import cz.mg.vulkan.enums.*;
import cz.mg.vulkan.flags.*;
import cz.mg.vulkan.jna.structures.*;
import static cz.mg.vulkan.jna.Vk.*;


public class VulkanRect2D {
    public final VkRect2D structure;

    public VulkanRect2D() {
        this.structure = new VkRect2D();
    }

    public VulkanRect2D(VkRect2D structure) {
        this.structure = structure;
    }

    public VulkanOffset2D getOffset(){
        return new VulkanOffset2D(structure.offset);
    }

    public VulkanExtent2D getExtent(){
        return new VulkanExtent2D(structure.extent);
    }
}

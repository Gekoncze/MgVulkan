package cz.mg.vulkan.structures;

import cz.mg.vulkan.enums.*;
import cz.mg.vulkan.flags.*;
import cz.mg.vulkan.jna.structures.*;
import static cz.mg.vulkan.jna.Vk.*;


public class VulkanExtent2D {
    public final VkExtent2D structure;

    public VulkanExtent2D() {
        this.structure = new VkExtent2D();
    }

    public VulkanExtent2D(VkExtent2D structure) {
        this.structure = structure;
    }

    public int getWidth(){
        return structure.width.intValue();
    }

    public int getHeight(){
        return structure.height.intValue();
    }
}

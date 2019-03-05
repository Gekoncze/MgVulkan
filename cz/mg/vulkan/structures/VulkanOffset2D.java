package cz.mg.vulkan.structures;

import cz.mg.vulkan.enums.*;
import cz.mg.vulkan.flags.*;
import cz.mg.vulkan.jna.structures.*;
import static cz.mg.vulkan.jna.Vk.*;


public class VulkanOffset2D {
    public final VkOffset2D structure;

    public VulkanOffset2D() {
        this.structure = new VkOffset2D();
    }

    public VulkanOffset2D(VkOffset2D structure) {
        this.structure = structure;
    }

    public int getX(){
        return structure.x.intValue();
    }

    public int getY(){
        return structure.y.intValue();
    }
}

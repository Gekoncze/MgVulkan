package cz.mg.vulkan.structures;

import cz.mg.vulkan.enums.*;
import cz.mg.vulkan.flags.*;
import cz.mg.vulkan.jna.structures.*;
import static cz.mg.vulkan.jna.Vk.*;


public class VulkanViewport {
    public final VkViewport structure;

    public VulkanViewport() {
        this.structure = new VkViewport();
    }

    public VulkanViewport(VkViewport structure) {
        this.structure = structure;
    }

    public float getX(){
        return structure.x;
    }

    public float getY(){
        return structure.y;
    }

    public float getWidth(){
        return structure.width;
    }

    public float getHeight(){
        return structure.height;
    }

    public float getMinDepth(){
        return structure.minDepth;
    }

    public float getMaxDepth(){
        return structure.maxDepth;
    }
}

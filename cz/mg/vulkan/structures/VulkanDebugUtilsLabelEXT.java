package cz.mg.vulkan.structures;

import com.sun.jna.Pointer;
import cz.mg.vulkan.enums.*;
import cz.mg.vulkan.jna.structures.*;


public class VulkanDebugUtilsLabelEXT {
    public final VkDebugUtilsLabelEXT structure;

    public VulkanDebugUtilsLabelEXT() {
        this.structure = new VkDebugUtilsLabelEXT();
    }

    public VulkanDebugUtilsLabelEXT(VkDebugUtilsLabelEXT structure) {
        this.structure = structure;
    }

    public VulkanStructureType getSType(){
        return VulkanStructureType.fromNativeEnum(structure.sType);
    }

    public Pointer getPNext(){
        return structure.pNext;
    }

    public String getPLabelName(){
        return structure.pLabelName;
    }

    public float[] getColor(){
        return structure.color;
    }
}

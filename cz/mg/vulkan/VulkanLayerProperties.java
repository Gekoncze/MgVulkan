package cz.mg.vulkan;

import cz.mg.vulkan.jna.structures.VkLayerProperties;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanLayerProperties {
    private final VkLayerProperties structure;

    public VulkanLayerProperties(VkLayerProperties structure) {
        this.structure = structure;
    }

    public String getLayerName(){
        return ToString.textToString(structure.layerName);
    }

    public Version getSpecVersion(){
        return new Version(structure.specVersion);
    }

    public Version getImplementationVersion(){
        return new Version(structure.implementationVersion);
    }

    public String getDescription(){
        return ToString.textToString(structure.description);
    }
}

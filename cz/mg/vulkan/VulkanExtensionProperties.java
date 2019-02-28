package cz.mg.vulkan;

import cz.mg.vulkan.jna.structures.VkExtensionProperties;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanExtensionProperties {
    private final VkExtensionProperties structure;

    public VulkanExtensionProperties(VkExtensionProperties structure) {
        this.structure = structure;
    }

    public String getExtensionName(){
        return ToString.textToString(structure.extensionName);
    }

    public Version getSpecVersion(){
        return new Version(structure.specVersion);
    }
}

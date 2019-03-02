package cz.mg.vulkan.structures;

import cz.mg.vulkan.jna.structures.VkExtensionProperties;
import cz.mg.vulkan.jna.utilities.ToString;
import cz.mg.vulkan.utilities.Version;


public class VulkanExtensionProperties {
    public final VkExtensionProperties structure;

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

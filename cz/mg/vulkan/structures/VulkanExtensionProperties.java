package cz.mg.vulkan.structures;

import cz.mg.vulkan.jna.structures.VkExtensionProperties;
import cz.mg.vulkan.jna.utilities.ToString;
import cz.mg.vulkan.utilities.Version;


public class VulkanExtensionProperties {
    public final VkExtensionProperties structure;

    public VulkanExtensionProperties() {
        this(new VkExtensionProperties());
    }

    public VulkanExtensionProperties(VkExtensionProperties structure) {
        if(structure == null) throw new IllegalArgumentException();
        this.structure = structure;
    }

    public String getExtensionName(){
        return ToString.textToString(structure.extensionName);
    }

    public Version getSpecVersion(){
        return new Version(structure.specVersion);
    }
}

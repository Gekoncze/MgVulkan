package cz.mg.vulkan;

import cz.mg.collections.array.Array;
import cz.mg.collections.array.ReadonlyArray;
import cz.mg.vulkan.jna.Vk;
import cz.mg.vulkan.jna.VkSimplified;
import cz.mg.vulkan.jna.arrays.VkExtensionPropertiesArray;
import cz.mg.vulkan.jna.arrays.VkLayerPropertiesArray;
import cz.mg.vulkan.structures.VulkanExtensionProperties;
import cz.mg.vulkan.structures.VulkanLayerProperties;


public class Vulkan {
    public final Vk vk;
    public final VkSimplified vks;
    private Array<VulkanExtensionProperties> extensionProperties = null;
    private Array<VulkanLayerProperties> layerProperties = null;

    public Vulkan() {
        this(Vk.loadLibrary());
    }

    public Vulkan(String libraryName) {
        this(Vk.loadLibrary(libraryName));
    }

    public Vulkan(Vk vk) {
        this.vk = vk;
        this.vks = new VkSimplified(vk);
    }

    public ReadonlyArray<VulkanExtensionProperties> getExtensionProperties() {
        if(extensionProperties == null){
            VkExtensionPropertiesArray array = vks.vkEnumerateInstanceExtensionProperties();
            extensionProperties = new Array<>(array.count());
            for(int i = 0; i < array.count(); i++) extensionProperties.set(i, new VulkanExtensionProperties(array.get(i)));
        }
        return extensionProperties;
    }

    public ReadonlyArray<VulkanLayerProperties> getLayerProperties() {
        if(layerProperties == null){
            VkLayerPropertiesArray array = vks.vkEnumerateInstanceLayerProperties();
            layerProperties = new Array<>(array.count());
            for(int i = 0; i < array.count(); i++) layerProperties.set(i, new VulkanLayerProperties(array.get(i)));
        }
        return layerProperties;
    }
}

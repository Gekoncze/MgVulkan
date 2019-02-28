package cz.mg.vulkan;

import cz.mg.collections.array.Array;
import cz.mg.collections.array.ReadonlyArray;
import cz.mg.vulkan.jna.VulkanNative;
import cz.mg.vulkan.jna.VulkanNativeSimplified;
import cz.mg.vulkan.jna.arrays.VkExtensionPropertiesArray;
import cz.mg.vulkan.jna.arrays.VkLayerPropertiesArray;


public class Vulkan {
    final VulkanNative vk;
    final VulkanNativeSimplified vks;
    private Array<VulkanExtensionProperties> extensionProperties = null;
    private Array<VulkanLayerProperties> layerProperties = null;

    public Vulkan() {
        this(VulkanNative.loadLibrary());
    }

    public Vulkan(String libraryName) {
        this(VulkanNative.loadLibrary(libraryName));
    }

    public Vulkan(VulkanNative vk) {
        this.vk = vk;
        this.vks = new VulkanNativeSimplified(vk);
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

package cz.mg.vulkan.handles;

import cz.mg.collections.array.Array;
import cz.mg.collections.array.ReadonlyArray;
import cz.mg.vulkan.handles.VulkanInstance;
import cz.mg.vulkan.jna.arrays.VkQueueFamilyPropertiesArray;
import cz.mg.vulkan.jna.handles.VkPhysicalDevice;
import cz.mg.vulkan.structures.VulkanPhysicalDeviceFeatures;
import cz.mg.vulkan.structures.VulkanPhysicalDeviceMemoryProperties;
import cz.mg.vulkan.structures.VulkanPhysicalDeviceProperties;
import cz.mg.vulkan.structures.VulkanQueueFamilyProperties;


public class VulkanPhysicalDevice {
    private final VulkanInstance parent;
    public final VkPhysicalDevice.ByValue handle;
    private VulkanPhysicalDeviceProperties properties = null;
    private VulkanPhysicalDeviceFeatures features = null;
    private VulkanPhysicalDeviceMemoryProperties memoryProperties = null;
    private Array<VulkanQueueFamilyProperties> queueFamilyProperties = null;

    public VulkanPhysicalDevice(VulkanInstance vulkanInstance, VkPhysicalDevice.ByValue handle) {
        this.parent = vulkanInstance;
        this.handle = handle;
    }

    public VulkanInstance getParent() {
        return parent;
    }

    public VulkanPhysicalDeviceProperties getProperties() {
        if(properties == null) properties = new VulkanPhysicalDeviceProperties(parent.getParent().vks.vkGetPhysicalDeviceProperties(handle));
        return properties;
    }

    public VulkanPhysicalDeviceFeatures getFeatures() {
        if(features == null) features = new VulkanPhysicalDeviceFeatures(parent.getParent().vks.vkGetPhysicalDeviceFeatures(handle));
        return features;
    }

    public VulkanPhysicalDeviceMemoryProperties getMemoryProperties() {
        if(memoryProperties == null) memoryProperties = new VulkanPhysicalDeviceMemoryProperties(parent.getParent().vks.vkGetPhysicalDeviceMemoryProperties(handle));
        return memoryProperties;
    }

    public ReadonlyArray<VulkanQueueFamilyProperties> getQueueFamilyProperties() {
        if(queueFamilyProperties == null){
            VkQueueFamilyPropertiesArray array = parent.getParent().vks.vkGetPhysicalDeviceQueueFamilyProperties(handle);
            queueFamilyProperties = new Array<>(array.count());
            for(int i = 0; i < array.count(); i++) queueFamilyProperties.set(i, new VulkanQueueFamilyProperties(array.get(i)));
        }
        return queueFamilyProperties;
    }
}

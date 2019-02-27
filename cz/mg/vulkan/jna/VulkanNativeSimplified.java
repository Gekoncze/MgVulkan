package cz.mg.vulkan.jna;

import cz.mg.vulkan.VulkanException;
import cz.mg.vulkan.jna.arrays.*;
import cz.mg.vulkan.jna.enums.VkResult;
import cz.mg.vulkan.jna.enums.VkStructureType;
import cz.mg.vulkan.jna.flags.VkInstanceCreateFlags;
import cz.mg.vulkan.jna.handles.VkInstance;
import cz.mg.vulkan.jna.handles.VkPhysicalDevice;
import cz.mg.vulkan.jna.structures.VkApplicationInfo;
import cz.mg.vulkan.jna.structures.VkInstanceCreateInfo;
import cz.mg.vulkan.jna.types.uint32_t;
import static cz.mg.vulkan.jna.enums.VkResult.*;
import static cz.mg.vulkan.jna.enums.VkStructureType.*;
import static com.sun.jna.Pointer.NULL;


/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/">khronos documentation</a>
 *  @see <a href="https://www.khronos.org/files/vulkan11-reference-guide.pdf">quick reference</a>
 **/
public class VulkanNativeSimplified {
    private final VulkanNative vk;

    public VulkanNativeSimplified(VulkanNative vk) {
        this.vk = vk;
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkEnumerateInstanceExtensionProperties.html">khronos documentation</a>
     **/
    public VkExtensionPropertiesArray vkEnumerateInstanceExtensionProperties(){
        return vkEnumerateInstanceExtensionProperties(null);
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkEnumerateInstanceExtensionProperties.html">khronos documentation</a>
     **/
    public VkExtensionPropertiesArray vkEnumerateInstanceExtensionProperties(String pLayerName){
        uint32_t.ByReference extensionPropertiesCount = new uint32_t.ByReference(0);
        VkResult result = vk.vkEnumerateInstanceExtensionProperties(pLayerName, extensionPropertiesCount, NULL);
        if(result.value != VkResult.VK_SUCCESS) throw new VulkanException(result, "vkEnumerateInstanceExtensionProperties");

        VkExtensionPropertiesArray properties = new VkExtensionPropertiesArray(extensionPropertiesCount.getValue());
        result = vk.vkEnumerateInstanceExtensionProperties(pLayerName, extensionPropertiesCount, properties.getPointer());
        if(result.value != VkResult.VK_SUCCESS) throw new VulkanException(result, "vkEnumerateInstanceExtensionProperties");

        properties.read();
        return properties;
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkEnumerateInstanceLayerProperties.html">khronos documentation</a>
     **/
    public VkLayerPropertiesArray vkEnumerateInstanceLayerProperties(){
        uint32_t.ByReference layerPropertiesCount = new uint32_t.ByReference(0);
        VkResult result = vk.vkEnumerateInstanceLayerProperties(layerPropertiesCount, NULL);
        if(result.value != VkResult.VK_SUCCESS) throw new VulkanException(result, "vkEnumerateInstanceLayerProperties");

        VkLayerPropertiesArray properties = new VkLayerPropertiesArray(layerPropertiesCount.getValue());
        result = vk.vkEnumerateInstanceLayerProperties(layerPropertiesCount, properties.getPointer());
        if(result.value != VkResult.VK_SUCCESS) throw new VulkanException(result, "vkEnumerateInstanceLayerProperties");

        properties.read();
        return properties;
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkCreateInstance.html">khronos documentation</a>
     **/
    public VkInstance.ByReference vkCreateInstance(uint32_t apiVersion, String applicationName, uint32_t applicationVersion, String engineName, uint32_t engineVersion, StringArray enabledExtensions, StringArray enabledLayers){
        VkApplicationInfo.ByReference applicationInfo = new VkApplicationInfo.ByReference();
        applicationInfo.sType = new VkStructureType.ByValue(VK_STRUCTURE_TYPE_APPLICATION_INFO);
        applicationInfo.pNext = NULL;
        applicationInfo.pApplicationName = applicationName;
        applicationInfo.applicationVersion = applicationVersion;
        applicationInfo.pEngineName = engineName;
        applicationInfo.engineVersion = engineVersion;
        applicationInfo.apiVersion = apiVersion;

        VkInstanceCreateInfo.ByReference instanceCreateInfo = new VkInstanceCreateInfo.ByReference();
        instanceCreateInfo.sType = new VkStructureType.ByValue(VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO);
        instanceCreateInfo.pNext = NULL;
        instanceCreateInfo.flags = new VkInstanceCreateFlags.ByValue(0);
        instanceCreateInfo.pApplicationInfo = applicationInfo;
        instanceCreateInfo.enabledExtensionCount = new uint32_t(enabledExtensions != null ? enabledExtensions.count() : 0);
        instanceCreateInfo.ppEnabledExtensionNames = enabledExtensions != null ? enabledExtensions.getPointer() : NULL;
        instanceCreateInfo.enabledLayerCount = new uint32_t(enabledLayers != null ? enabledLayers.count() : 0);
        instanceCreateInfo.ppEnabledLayerNames = enabledLayers != null ? enabledLayers.getPointer() : NULL;

        VkInstance.ByReference instance = new VkInstance.ByReference();
        VkResult result = vk.vkCreateInstance(instanceCreateInfo, null, instance);
        if(result.value != VK_SUCCESS) throw new VulkanException(result, "vkCreateInstance");
        return instance;
    }


    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkEnumeratePhysicalDevices.html">khronos documentation</a>
     **/
    public VkPhysicalDeviceArray vkEnumeratePhysicalDevices(VkInstance.ByValue instance){
        uint32_t.ByReference deviceCount = new uint32_t.ByReference(0);
        VkResult result = vk.vkEnumeratePhysicalDevices(instance, deviceCount, NULL);
        if(result.value != VkResult.VK_SUCCESS) throw new VulkanException(result, "vkEnumeratePhysicalDevices");

        VkPhysicalDeviceArray physicalDevices = new VkPhysicalDeviceArray(deviceCount.getValue());
        result = vk.vkEnumeratePhysicalDevices(instance, deviceCount, physicalDevices.getPointer());
        if(result.value != VkResult.VK_SUCCESS) throw new VulkanException(result, "vkEnumeratePhysicalDevices");

        physicalDevices.read();
        return physicalDevices;
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkGetPhysicalDeviceQueueFamilyProperties.html">khronos documentation</a>
     **/
    public VkQueueFamilyPropertiesArray vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice.ByValue physicalDevice){
        uint32_t.ByReference queueFamilyCount = new uint32_t.ByReference(0);
        vk.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, queueFamilyCount, NULL);
        VkQueueFamilyPropertiesArray familyProperties = new VkQueueFamilyPropertiesArray(queueFamilyCount.getValue());
        vk.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, queueFamilyCount, familyProperties.getPointer());
        familyProperties.read();
        return familyProperties;
    }
}

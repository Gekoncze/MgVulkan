package cz.mg.vulkan.jna;

import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.flags.VkDeviceCreateFlags;
import cz.mg.vulkan.jna.flags.VkDeviceQueueCreateFlags;
import cz.mg.vulkan.jna.handles.VkDevice;
import cz.mg.vulkan.jna.handles.VkQueue;
import cz.mg.vulkan.utilities.VulkanException;
import cz.mg.vulkan.jna.arrays.*;
import cz.mg.vulkan.jna.enums.VkResult;
import cz.mg.vulkan.jna.enums.VkStructureType;
import cz.mg.vulkan.jna.flags.VkInstanceCreateFlags;
import cz.mg.vulkan.jna.handles.VkInstance;
import cz.mg.vulkan.jna.handles.VkPhysicalDevice;
import cz.mg.vulkan.jna.structures.*;
import cz.mg.vulkan.jna.types.uint32_t;
import static cz.mg.vulkan.jna.enums.VkResult.*;
import static cz.mg.vulkan.jna.enums.VkStructureType.*;
import static com.sun.jna.Pointer.NULL;


/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/">khronos documentation</a>
 *  @see <a href="https://www.khronos.org/files/vulkan11-reference-guide.pdf">quick reference</a>
 **/
public class VkSimplified {
    private final Vk vk;

    public VkSimplified(Vk vk) {
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
    public VkInstance.ByValue vkCreateInstance(uint32_t apiVersion, String applicationName, uint32_t applicationVersion, String engineName, uint32_t engineVersion, StringArray enabledExtensions, StringArray enabledLayers){
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
        return instance.byValue(true, true);
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

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkGetPhysicalDeviceProperties.html">khronos documentation</a>
     **/
    public VkPhysicalDeviceProperties.ByReference vkGetPhysicalDeviceProperties(VkPhysicalDevice.ByValue physicalDevice){
        VkPhysicalDeviceProperties.ByReference deviceProperties = new VkPhysicalDeviceProperties.ByReference();
        vk.vkGetPhysicalDeviceProperties(physicalDevice, deviceProperties);
        return deviceProperties;
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkGetPhysicalDeviceFeatures.html">khronos documentation</a>
     **/
    public VkPhysicalDeviceFeatures.ByReference vkGetPhysicalDeviceFeatures(VkPhysicalDevice.ByValue physicalDevice){
        VkPhysicalDeviceFeatures.ByReference deviceFeatures = new VkPhysicalDeviceFeatures.ByReference();
        vk.vkGetPhysicalDeviceFeatures(physicalDevice, deviceFeatures);
        return deviceFeatures;
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkGetPhysicalDeviceMemoryProperties.html">khronos documentation</a>
     **/
    public VkPhysicalDeviceMemoryProperties.ByReference vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice.ByValue physicalDevice){
        VkPhysicalDeviceMemoryProperties.ByReference deviceMemoryProperties = new VkPhysicalDeviceMemoryProperties.ByReference();
        vk.vkGetPhysicalDeviceMemoryProperties(physicalDevice, deviceMemoryProperties);
        return deviceMemoryProperties;
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkDestroyInstance.html">khronos documentation</a>
     **/
    public void vkDestroyInstance(VkInstance.ByValue instance){
        vk.vkDestroyInstance(instance, null);
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkGetInstanceProcAddr.html">khronos documentation</a>
     **/
    public Pointer vkGetInstanceProcAddr(VkInstance.ByValue instance, String pName){
        Pointer function = vk.vkGetInstanceProcAddr(instance, pName);
        if(function == null || function == Pointer.NULL) throw new VulkanException(null, "vkGetInstanceProcAddr", pName);
        return function;
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkCreateDevice.html">khronos documentation</a>
     **/
    public VkDevice.ByValue vkCreateDevice(VkPhysicalDevice.ByValue physicalDevice, VkPhysicalDeviceFeatures.ByReference features, int queueFamilyIndex){
        FloatArray priorities = new FloatArray(new float[]{1.0f});

        VkDeviceQueueCreateInfoArray createInfos = new VkDeviceQueueCreateInfoArray(1);
        VkDeviceQueueCreateInfo queueCreateInfo = createInfos.get(0);
        queueCreateInfo.sType = new VkStructureType(VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO);
        queueCreateInfo.pNext = null;
        queueCreateInfo.flags = new VkDeviceQueueCreateFlags(0);
        queueCreateInfo.queueFamilyIndex = new uint32_t(queueFamilyIndex);
        queueCreateInfo.queueCount = new uint32_t(1);
        queueCreateInfo.pQueuePriorities = priorities.getPointer();
        createInfos.write();

        VkDeviceCreateInfo.ByReference deviceCreateInfo = new VkDeviceCreateInfo.ByReference();
        deviceCreateInfo.sType = new VkStructureType(VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO);
        deviceCreateInfo.pNext = null;
        deviceCreateInfo.flags = new VkDeviceCreateFlags(0);
        deviceCreateInfo.queueCreateInfoCount = new uint32_t(1);
        deviceCreateInfo.pQueueCreateInfos = createInfos.getPointer();
        deviceCreateInfo.pEnabledFeatures = features;
        deviceCreateInfo.enabledExtensionCount = new uint32_t(0);
        deviceCreateInfo.ppEnabledExtensionNames = null;
        deviceCreateInfo.enabledLayerCount = new uint32_t(0);
        deviceCreateInfo.ppEnabledLayerNames = null;

        VkDevice.ByReference device = new VkDevice.ByReference();
        VkResult.ByValue result = vk.vkCreateDevice(physicalDevice, deviceCreateInfo, null, device);
        if(result.value != VkResult.VK_SUCCESS) throw new VulkanException(result, "vkCreateDevice");
        return device.byValue(true, true);
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkDestroyDevice.html">khronos documentation</a>
     **/
    public void vkDestroyDevice(VkDevice.ByValue device){
        vk.vkDestroyDevice(device, null);
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkGetDeviceQueue.html">khronos documentation</a>
     **/
    public VkQueue.ByValue vkGetDeviceQueue(VkDevice.ByValue device, int queueFamilyIndex, int queueIndex){
        VkQueue.ByReference queue = new VkQueue.ByReference();
        vk.vkGetDeviceQueue(device, new uint32_t(queueFamilyIndex), new uint32_t(queueIndex), queue);
        return queue.byValue(true, true);
    }
}

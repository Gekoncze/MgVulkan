package cz.mg.vulkan.jna;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.handles.VkDevice;
import cz.mg.vulkan.jna.handles.VkPhysicalDevice;
import cz.mg.vulkan.jna.handles.VkQueue;
import cz.mg.vulkan.jna.structures.*;
import cz.mg.vulkan.jna.handles.VkInstance;
import cz.mg.vulkan.jna.enums.VkResult;
import cz.mg.vulkan.jna.types.uint32_t;


/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/">khronos documentation</a>
 *  @see <a href="https://www.khronos.org/files/vulkan11-reference-guide.pdf">quick reference</a>
 **/
public interface Vk extends Library {
    public static final int ENUM_SIZE = 4;

    public static final int VK_TRUE = 1;
    public static final int VK_FALSE = 0;
    public static final int VK_MAX_PHYSICAL_DEVICE_NAME_SIZE = 256;
    public static final int VK_UUID_SIZE = 16;
    public static final int VK_MAX_MEMORY_TYPES = 32;
    public static final int VK_MAX_MEMORY_HEAPS = 16;
    public static final int VK_MAX_EXTENSION_NAME_SIZE = 256;
    public static final int VK_MAX_DESCRIPTION_SIZE = 256;

    public static final String VK_EXT_DEBUG_REPORT_EXTENSION_NAME = "VK_EXT_debug_report";

    public static final uint32_t VK_API_VERSION_1_0 = VK_MAKE_VERSION(1, 0, 0);

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_MAKE_VERSION.html">khronos documentation</a>
     **/
    public static uint32_t VK_MAKE_VERSION(int major, int minor, int patch){
        return new uint32_t(((major) << 22) | ((minor) << 12) | (patch));
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_VERSION_MAJOR.html">khronos documentation</a>
     **/
    public static int VK_VERSION_MAJOR(uint32_t version) {
        return version.intValue() >> 22;
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_VERSION_MINOR.html">khronos documentation</a>
     **/
    public static int VK_VERSION_MINOR(uint32_t version){
        return (version.intValue() >> 12) & 0x3ff;
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VK_VERSION_PATCH.html">khronos documentation</a>
     **/
    public static int VK_VERSION_PATCH(uint32_t version){
        return version.intValue() & 0xfff;
    }

    public static Vk loadLibrary(){
        return loadLibrary("vulkan");
    }

    public static Vk loadLibrary(String name){
        return Native.loadLibrary(name, Vk.class);
    }

    /**
     *  VkResult vkEnumerateInstanceExtensionProperties(const char* pLayerName, uint32_t* pPropertyCount, VkExtensionProperties* pProperties);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkEnumerateInstanceExtensionProperties.html">khronos documentation</a>
     **/
    public VkResult.ByValue vkEnumerateInstanceExtensionProperties(String pLayerName, uint32_t.ByReference pPropertyCount, Pointer pProperties);

    /**
     *  VkResult vkEnumerateInstanceLayerProperties(uint32_t* pPropertyCount, VkLayerProperties* pProperties);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkEnumerateInstanceLayerProperties.html">khronos documentation</a>
     **/
    public VkResult.ByValue vkEnumerateInstanceLayerProperties(uint32_t.ByReference pPropertyCount, Pointer pProperties);

    /**
     *  VkResult vkCreateInstance(const VkInstanceCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkInstance* pInstance);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkCreateInstance.html">khronos documentation</a>
     **/
    public VkResult.ByValue vkCreateInstance(VkInstanceCreateInfo.ByReference pCreateInfo, VkAllocationCallbacks.ByReference pAllocator, VkInstance.ByReference pInstance);

    /**
     *  VkResult vkEnumeratePhysicalDevices(VkInstance instance, uint32_t* pPhysicalDeviceCount, VkPhysicalDevice* pPhysicalDevices);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkEnumeratePhysicalDevices.html">khronos documentation</a>
     **/
    public VkResult.ByValue vkEnumeratePhysicalDevices(VkInstance.ByValue instance, uint32_t.ByReference pPhysicalDeviceCount, Pointer pPhysicalDevices);

    /**
     *  void vkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties* pProperties);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkGetPhysicalDeviceProperties.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceProperties(VkPhysicalDevice.ByValue physicalDevice, VkPhysicalDeviceProperties.ByReference pProperties);

    /**
     *  void vkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures* pFeatures);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkGetPhysicalDeviceFeatures.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceFeatures(VkPhysicalDevice.ByValue physicalDevice, VkPhysicalDeviceFeatures.ByReference pFeatures);

    /**
     *  void vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties* pMemoryProperties);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkGetPhysicalDeviceMemoryProperties.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice.ByValue physicalDevice, VkPhysicalDeviceMemoryProperties.ByReference pMemoryProperties);

    /**
     *  void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, uint32_t* pQueueFamilyPropertyCount, VkQueueFamilyProperties* pQueueFamilyProperties);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkGetPhysicalDeviceQueueFamilyProperties.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice.ByValue physicalDevice, uint32_t.ByReference pQueueFamilyPropertyCount, Pointer pQueueFamilyProperties);

    /**
     *  void vkDestroyInstance(VkInstance instance, const VkAllocationCallbacks* pAllocator);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkDestroyInstance.html">khronos documentation</a>
     **/
    public void vkDestroyInstance(VkInstance.ByValue instance, VkAllocationCallbacks.ByReference pAllocator);

    /**
     *  PFN_vkVoidFunction vkGetInstanceProcAddr(VkInstance instance, const char* pName);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkGetInstanceProcAddr.html">khronos documentation</a>
     **/
    public Pointer vkGetInstanceProcAddr(VkInstance.ByValue instance, String pName);

    /**
     *  VkResult vkCreateDevice(VkPhysicalDevice physicalDevice, const VkDeviceCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDevice* pDevice);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkCreateDevice.html">khronos documentation</a>
     **/
    public VkResult.ByValue vkCreateDevice(VkPhysicalDevice.ByValue physicalDevice, VkDeviceCreateInfo.ByReference pCreateInfo, VkAllocationCallbacks.ByReference pAllocator, VkDevice.ByReference pDevice);

    /**
     *  void vkDestroyDevice(VkDevice device, const VkAllocationCallbacks* pAllocator);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkDestroyDevice.html">khronos documentation</a>
     **/
    public void vkDestroyDevice(VkDevice.ByValue device, VkAllocationCallbacks.ByReference pAllocator);

    /**
     *  void vkGetDeviceQueue(VkDevice.ByValue device, uint32_t queueFamilyIndex, uint32_t queueIndex, VkQueue.ByReference pQueue);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkGetDeviceQueue.html">khronos documentation</a>
     **/
    public void vkGetDeviceQueue(VkDevice.ByValue device, uint32_t queueFamilyIndex, uint32_t queueIndex, VkQueue.ByReference pQueue);
}

package cz.mg.vulkan.jna;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import cz.mg.vulkan.jna.handles.VkPhysicalDevice;
import cz.mg.vulkan.jna.structures.*;
import cz.mg.vulkan.jna.handles.VkInstance;
import cz.mg.vulkan.jna.enums.VkResult;


/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/">khronos documentation</a>
 *  @see <a href="https://www.khronos.org/files/vulkan11-reference-guide.pdf">quick reference</a>
 **/
public interface VulkanNative extends Library {
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

    public static final int VK_API_VERSION_1_0 = VK_MAKE_VERSION(1, 0, 0);

    public static int VK_MAKE_VERSION(int major, int minor, int patch){
        return (((major) << 22) | ((minor) << 12) | (patch));
    }

    public static int VK_VERSION_MAJOR(int version) {
        return version >> 22;
    }

    public static int VK_VERSION_MINOR(int version){
        return (version >> 12) & 0x3ff;
    }
    public static int VK_VERSION_PATCH(int version){
        return version & 0xfff;
    }

    public static VulkanNative loadLibrary(){
        return loadLibrary("vulkan");
    }

    public static VulkanNative loadLibrary(String name){
        return Native.loadLibrary(name, VulkanNative.class);
    }

    /**
     *  VkResult vkEnumerateInstanceExtensionProperties(const char* pLayerName, uint32_t* pPropertyCount, VkExtensionProperties* pProperties);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkEnumerateInstanceExtensionProperties.html">khronos documentation</a>
     **/
    public VkResult.ByValue vkEnumerateInstanceExtensionProperties(String pLayerName, IntByReference pPropertyCount, Pointer pProperties);

    /**
     *  VkResult vkEnumerateInstanceLayerProperties(uint32_t* pPropertyCount, VkLayerProperties* pProperties);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkEnumerateInstanceLayerProperties.html">khronos documentation</a>
     **/
    public VkResult.ByValue vkEnumerateInstanceLayerProperties(IntByReference pPropertyCount, Pointer pProperties);

    /**
     *  VkResult vkCreateInstance(const VkInstanceCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkInstance* pInstance);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkCreateInstance.html">khronos documentation</a>
     **/
    public VkResult.ByValue vkCreateInstance(VkInstanceCreateInfo.ByReference pCreateInfo, VkAllocationCallbacks.ByReference pAllocator, VkInstance.ByReference pInstance);

    /**
     *  VkResult vkEnumeratePhysicalDevices(VkInstance instance, uint32_t* pPhysicalDeviceCount, VkPhysicalDevice* pPhysicalDevices);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkEnumeratePhysicalDevices.html">khronos documentation</a>
     **/
    public VkResult.ByValue vkEnumeratePhysicalDevices(VkInstance.ByValue instance, IntByReference pPhysicalDeviceCount, Pointer pPhysicalDevices);

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
//    public void vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice.ByValue physicalDevice, Pointer pMemoryProperties);

    /**
     *  void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, uint32_t* pQueueFamilyPropertyCount, VkQueueFamilyProperties* pQueueFamilyProperties);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkGetPhysicalDeviceQueueFamilyProperties.html">khronos documentation</a>
     **/
    public void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice.ByValue physicalDevice, IntByReference pQueueFamilyPropertyCount, Pointer pQueueFamilyProperties);
}

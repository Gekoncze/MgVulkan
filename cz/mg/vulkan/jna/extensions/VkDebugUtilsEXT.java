package cz.mg.vulkan.jna.extensions;

import cz.mg.vulkan.jna.VkSimplified;
import cz.mg.vulkan.jna.callbacks.PFN_vkCreateDebugUtilsMessengerEXT;
import cz.mg.vulkan.jna.callbacks.PFN_vkDestroyDebugUtilsMessengerEXT;
import cz.mg.vulkan.jna.enums.VkResult;
import cz.mg.vulkan.jna.handles.VkDebugUtilsMessengerEXT;
import cz.mg.vulkan.jna.handles.VkInstance;
import cz.mg.vulkan.jna.structures.VkAllocationCallbacks;
import cz.mg.vulkan.jna.structures.VkDebugUtilsMessengerCreateInfoEXT;


public interface VkDebugUtilsEXT {
    public static VkDebugUtilsEXT load(VkInstance.ByValue instance, VkSimplified vks){
        return new VkDebugUtilsEXT() {
            private final PFN_vkCreateDebugUtilsMessengerEXT vkCreateDebugUtilsMessengerEXT = PFN_vkCreateDebugUtilsMessengerEXT.fromPointer(vks.vkGetInstanceProcAddr(instance, "vkCreateDebugUtilsMessengerEXT"));
            private final PFN_vkDestroyDebugUtilsMessengerEXT vkDestroyDebugUtilsMessengerEXT = PFN_vkDestroyDebugUtilsMessengerEXT.fromPointer(vks.vkGetInstanceProcAddr(instance, "vkDestroyDebugUtilsMessengerEXT"));

            @Override
            public VkResult.ByValue vkCreateDebugUtilsMessengerEXT(VkInstance.ByValue instance, VkDebugUtilsMessengerCreateInfoEXT.ByReference pCreateInfo, VkAllocationCallbacks.ByReference pAllocator, VkDebugUtilsMessengerEXT.ByReference pMessenger) {
                return vkCreateDebugUtilsMessengerEXT.callback(instance, pCreateInfo, pAllocator, pMessenger);
            }

            @Override
            public void vkDestroyDebugUtilsMessengerEXT(VkInstance.ByValue instance, VkDebugUtilsMessengerEXT.ByValue messenger, VkAllocationCallbacks.ByReference pAllocator) {
                vkDestroyDebugUtilsMessengerEXT.callback(instance, messenger, pAllocator);
            }
        };
    }

    /**
     *  VkResult vkCreateDebugUtilsMessengerEXT(
     *     VkInstance                                  instance,
     *     const VkDebugUtilsMessengerCreateInfoEXT*   pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkDebugUtilsMessengerEXT*                   pMessenger);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkCreateDebugUtilsMessengerEXT.html">khronos documentation</a>
     **/
    public VkResult.ByValue vkCreateDebugUtilsMessengerEXT(VkInstance.ByValue instance, VkDebugUtilsMessengerCreateInfoEXT.ByReference pCreateInfo, VkAllocationCallbacks.ByReference pAllocator, VkDebugUtilsMessengerEXT.ByReference pMessenger);

    /**
     *  void vkDestroyDebugUtilsMessengerEXT(
     *     VkInstance                                  instance,
     *     VkDebugUtilsMessengerEXT                    messenger,
     *     const VkAllocationCallbacks*                pAllocator);
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkDestroyDebugUtilsMessengerEXT.html">khronos documentation</a>
     **/
    public void vkDestroyDebugUtilsMessengerEXT(VkInstance.ByValue instance, VkDebugUtilsMessengerEXT.ByValue messenger, VkAllocationCallbacks.ByReference pAllocator);
}

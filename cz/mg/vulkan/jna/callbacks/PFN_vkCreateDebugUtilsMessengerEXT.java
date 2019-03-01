package cz.mg.vulkan.jna.callbacks;

import com.sun.jna.Callback;
import com.sun.jna.CallbackReference;
import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.enums.VkResult;
import cz.mg.vulkan.jna.handles.VkDebugUtilsMessengerEXT;
import cz.mg.vulkan.jna.handles.VkInstance;
import cz.mg.vulkan.jna.structures.VkAllocationCallbacks;
import cz.mg.vulkan.jna.structures.VkDebugUtilsMessengerCreateInfoEXT;


/**
 *  typedef VkResult (VKAPI_PTR *PFN_vkCreateDebugUtilsMessengerEXT)(
 *      VkInstance instance,
 *      const VkDebugUtilsMessengerCreateInfoEXT* pCreateInfo,
 *      const VkAllocationCallbacks* pAllocator,
 *      VkDebugUtilsMessengerEXT* pMessenger);
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateDebugUtilsMessengerEXT.html">khronos documentation</a>
 **/
public interface PFN_vkCreateDebugUtilsMessengerEXT extends Callback {
    public VkResult.ByValue callback(
            VkInstance.ByValue instance,
            VkDebugUtilsMessengerCreateInfoEXT.ByReference pCreateInfo,
            VkAllocationCallbacks.ByReference pAllocator,
            VkDebugUtilsMessengerEXT.ByReference pMessenger
    );

    public static PFN_vkCreateDebugUtilsMessengerEXT fromPointer(Pointer p){
        return (PFN_vkCreateDebugUtilsMessengerEXT) CallbackReference.getCallback(PFN_vkCreateDebugUtilsMessengerEXT.class, p);
    }
}

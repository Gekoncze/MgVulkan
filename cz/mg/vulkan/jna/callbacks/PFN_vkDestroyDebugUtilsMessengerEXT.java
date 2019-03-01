package cz.mg.vulkan.jna.callbacks;

import com.sun.jna.Callback;
import com.sun.jna.CallbackReference;
import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.handles.VkDebugUtilsMessengerEXT;
import cz.mg.vulkan.jna.handles.VkInstance;
import cz.mg.vulkan.jna.structures.VkAllocationCallbacks;


/**
 *  typedef void (VKAPI_PTR *PFN_vkDestroyDebugUtilsMessengerEXT)(
 *      VkInstance instance,
 *      VkDebugUtilsMessengerEXT messenger,
 *      const VkAllocationCallbacks* pAllocator);
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyDebugUtilsMessengerEXT.html">khronos documentation</a>
 **/
public interface PFN_vkDestroyDebugUtilsMessengerEXT extends Callback {
    public void callback(
            VkInstance.ByValue instance,
            VkDebugUtilsMessengerEXT.ByValue messenger,
            VkAllocationCallbacks.ByReference pAllocator
    );

    public static PFN_vkDestroyDebugUtilsMessengerEXT fromPointer(Pointer p){
        return (PFN_vkDestroyDebugUtilsMessengerEXT) CallbackReference.getCallback(PFN_vkDestroyDebugUtilsMessengerEXT.class, p);
    }
}

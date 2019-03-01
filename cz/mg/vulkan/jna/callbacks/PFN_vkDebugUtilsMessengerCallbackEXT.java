package cz.mg.vulkan.jna.callbacks;

import com.sun.jna.Callback;
import com.sun.jna.CallbackReference;
import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.flags.VkDebugUtilsMessageSeverityFlagsEXT;
import cz.mg.vulkan.jna.flags.VkDebugUtilsMessageTypeFlagsEXT;
import cz.mg.vulkan.jna.structures.VkDebugUtilsMessengerCallbackDataEXT;
import cz.mg.vulkan.jna.types.VkBool32;


/**
 *  typedef VkBool32 (VKAPI_PTR *PFN_vkDebugUtilsMessengerCallbackEXT)(
 *      VkDebugUtilsMessageSeverityFlagBitsEXT           messageSeverity,
 *      VkDebugUtilsMessageTypeFlagsEXT                  messageType,
 *      const VkDebugUtilsMessengerCallbackDataEXT*      pCallbackData,
 *      void*                                            pUserData);
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDebugUtilsMessengerCallbackEXT.html">khronos documentation</a>
 **/
public interface PFN_vkDebugUtilsMessengerCallbackEXT extends Callback {
    public VkBool32 callback(
            VkDebugUtilsMessageSeverityFlagsEXT.ByValue messageSeverity,
            VkDebugUtilsMessageTypeFlagsEXT.ByValue messageType,
            VkDebugUtilsMessengerCallbackDataEXT.ByReference pCallbackData,
            Pointer pUserData
    );

    public static PFN_vkDebugUtilsMessengerCallbackEXT fromPointer(Pointer p){
        return (PFN_vkDebugUtilsMessengerCallbackEXT) CallbackReference.getCallback(PFN_vkDebugUtilsMessengerCallbackEXT.class, p);
    }
}

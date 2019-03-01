package cz.mg.vulkan.jna.extensions;

import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.callbacks.PFN_vkDebugUtilsMessengerCallbackEXT;
import cz.mg.vulkan.jna.enums.VkResult;
import cz.mg.vulkan.jna.enums.VkStructureType;
import cz.mg.vulkan.jna.flags.VkDebugUtilsMessageSeverityFlagsEXT;
import cz.mg.vulkan.jna.flags.VkDebugUtilsMessageTypeFlagsEXT;
import cz.mg.vulkan.jna.flags.VkDebugUtilsMessengerCreateFlagsEXT;
import cz.mg.vulkan.jna.handles.VkDebugUtilsMessengerEXT;
import cz.mg.vulkan.jna.handles.VkInstance;
import cz.mg.vulkan.jna.structures.VkAllocationCallbacks;
import cz.mg.vulkan.jna.structures.VkDebugUtilsMessengerCreateInfoEXT;
import cz.mg.vulkan.utilities.VulkanException;


public class VulkanNativeDebugUtilsSimplified {
    private final VulkanNativeDebugUtils vkdu;

    public VulkanNativeDebugUtilsSimplified(VulkanNativeDebugUtils vkdu) {
        this.vkdu = vkdu;
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkCreateDebugUtilsMessengerEXT.html">khronos documentation</a>
     **/
    public VkDebugUtilsMessengerEXT.ByValue vkCreateDebugUtilsMessengerEXT(VkInstance.ByValue instance, VkDebugUtilsMessageSeverityFlagsEXT messageSeverity, VkDebugUtilsMessageTypeFlagsEXT messageType, PFN_vkDebugUtilsMessengerCallbackEXT debugCallback, Pointer userData){
        VkDebugUtilsMessengerCreateInfoEXT.ByReference createInfo = new VkDebugUtilsMessengerCreateInfoEXT.ByReference();
        createInfo.sType = new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT);
        createInfo.pNext = null;
        createInfo.flags = new VkDebugUtilsMessengerCreateFlagsEXT(0);
        createInfo.messageSeverity = messageSeverity;
        createInfo.messageType = messageType;
        createInfo.pfnUserCallback = debugCallback;
        createInfo.pUserData = userData;

        VkDebugUtilsMessengerEXT.ByReference messenger = new VkDebugUtilsMessengerEXT.ByReference();
        VkResult result = vkdu.vkCreateDebugUtilsMessengerEXT(instance, createInfo, null, messenger);
        if(result.value != VkResult.VK_SUCCESS) throw new VulkanException(result, "vkCreateDebugUtilsMessengerEXT");
        return new VkDebugUtilsMessengerEXT.ByValue(messenger);
    }

    /**
     *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/vkDestroyDebugUtilsMessengerEXT.html">khronos documentation</a>
     **/
    public void vkDestroyDebugUtilsMessengerEXT(VkInstance.ByValue instance, VkDebugUtilsMessengerEXT.ByValue messenger){
        vkdu.vkDestroyDebugUtilsMessengerEXT(instance, messenger, null);
    }
}

package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateDebugUtilsMessengerEXT.html">khronos documentation</a>
 **/
public class PFNvkCreateDebugUtilsMessengerEXT extends VkFunctionPointer {
    public PFNvkCreateDebugUtilsMessengerEXT() {
    }

    public PFNvkCreateDebugUtilsMessengerEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateDebugUtilsMessengerEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateDebugUtilsMessengerEXT(long value) {
        setValue(value);
    }

    public PFNvkCreateDebugUtilsMessengerEXT(VkInstance instance) {
        super(instance, new VkString("vkCreateDebugUtilsMessengerEXT"));
    }

    public void call(VkInstance instance, VkDebugUtilsMessengerCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkDebugUtilsMessengerEXT pMessenger, VkResult rval){
        call(getValue(), instance != null ? instance.getVkAddress() : VkInstance.NULL.getVkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pMessenger != null ? pMessenger.getVkAddress() : VkDebugUtilsMessengerEXT.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long instance, long pCreateInfo, long pAllocator, long pMessenger, long rval);
}

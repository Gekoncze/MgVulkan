package cz.mg.vulkan.vk;

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
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.NULL_ADDRESS, pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pMessenger != null ? pMessenger.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long instance, long pCreateInfo, long pAllocator, long pMessenger, long rval);
}

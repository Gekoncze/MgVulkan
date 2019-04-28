package cz.mg.vulkan;

public class PFNvkCreateDebugUtilsMessengerEXT extends VkFunctionPointer {
    public PFNvkCreateDebugUtilsMessengerEXT() {
    }

    protected PFNvkCreateDebugUtilsMessengerEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateDebugUtilsMessengerEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateDebugUtilsMessengerEXT(long value) {
        setValue(value);
    }

    public PFNvkCreateDebugUtilsMessengerEXT(VkInstance instance) {
        super(instance, new VkString("vkCreateDebugUtilsMessengerEXT"));
    }

    public void call(VkInstance instance, VkDebugUtilsMessengerCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkDebugUtilsMessengerEXT pMessenger, VkResult rval){
        callNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pMessenger != null ? pMessenger.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long instance, long pCreateInfo, long pAllocator, long pMessenger, long rval);


    public int call(VkInstance instance, VkDebugUtilsMessengerCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkDebugUtilsMessengerEXT pMessenger){
        return callSimplifiedNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pMessenger != null ? pMessenger.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long instance, long pCreateInfo, long pAllocator, long pMessenger);

}

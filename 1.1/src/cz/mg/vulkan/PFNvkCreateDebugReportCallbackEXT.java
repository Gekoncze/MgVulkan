package cz.mg.vulkan;

public class PFNvkCreateDebugReportCallbackEXT extends VkFunctionPointer {
    public PFNvkCreateDebugReportCallbackEXT() {
    }

    protected PFNvkCreateDebugReportCallbackEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateDebugReportCallbackEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateDebugReportCallbackEXT(long value) {
        setValue(value);
    }

    public PFNvkCreateDebugReportCallbackEXT(VkInstance instance) {
        super(instance, new VkString("vkCreateDebugReportCallbackEXT"));
    }

    public int call(VkInstance instance, VkDebugReportCallbackCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkDebugReportCallbackEXT pCallback){
        return callNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pCallback != null ? pCallback.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long instance, long pCreateInfo, long pAllocator, long pCallback);

}

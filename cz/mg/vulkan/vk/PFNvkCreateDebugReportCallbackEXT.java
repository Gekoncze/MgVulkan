package cz.mg.vulkan.vk;

public class PFNvkCreateDebugReportCallbackEXT extends VkFunctionPointer {
    public PFNvkCreateDebugReportCallbackEXT() {
    }

    public PFNvkCreateDebugReportCallbackEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateDebugReportCallbackEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateDebugReportCallbackEXT(long value) {
        setValue(value);
    }

    public PFNvkCreateDebugReportCallbackEXT(VkInstance instance) {
        super(instance, new VkString("vkCreateDebugReportCallbackEXT"));
    }

    public void call(VkInstance instance, VkDebugReportCallbackCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkDebugReportCallbackEXT pCallback, VkResult rval){
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.NULL_ADDRESS, pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pCallback != null ? pCallback.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long instance, long pCreateInfo, long pAllocator, long pCallback, long rval);
}

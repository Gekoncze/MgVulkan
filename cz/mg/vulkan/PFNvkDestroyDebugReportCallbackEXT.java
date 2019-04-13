package cz.mg.vulkan;

public class PFNvkDestroyDebugReportCallbackEXT extends VkFunctionPointer {
    public PFNvkDestroyDebugReportCallbackEXT() {
    }

    public PFNvkDestroyDebugReportCallbackEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyDebugReportCallbackEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyDebugReportCallbackEXT(long value) {
        setValue(value);
    }

    public PFNvkDestroyDebugReportCallbackEXT(VkInstance instance) {
        super(instance, new VkString("vkDestroyDebugReportCallbackEXT"));
    }

    public void call(VkInstance instance, VkDebugReportCallbackEXT callback, VkAllocationCallbacks pAllocator){
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getSinkAddress(), callback != null ? callback.getVkAddress() : VkPointer.getSinkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long instance, long callback, long pAllocator);
}

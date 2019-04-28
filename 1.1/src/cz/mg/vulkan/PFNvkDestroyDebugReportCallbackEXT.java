package cz.mg.vulkan;

public class PFNvkDestroyDebugReportCallbackEXT extends VkFunctionPointer {
    public PFNvkDestroyDebugReportCallbackEXT() {
    }

    protected PFNvkDestroyDebugReportCallbackEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyDebugReportCallbackEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyDebugReportCallbackEXT(long value) {
        setValue(value);
    }

    public PFNvkDestroyDebugReportCallbackEXT(VkInstance instance) {
        super(instance, new VkString("vkDestroyDebugReportCallbackEXT"));
    }

    public void call(VkInstance instance, VkDebugReportCallbackEXT callback, VkAllocationCallbacks pAllocator){
        callNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), callback != null ? callback.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long instance, long callback, long pAllocator);



}

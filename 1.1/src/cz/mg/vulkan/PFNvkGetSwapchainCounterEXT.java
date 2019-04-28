package cz.mg.vulkan;

public class PFNvkGetSwapchainCounterEXT extends VkFunctionPointer {
    public PFNvkGetSwapchainCounterEXT() {
    }

    protected PFNvkGetSwapchainCounterEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetSwapchainCounterEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetSwapchainCounterEXT(long value) {
        setValue(value);
    }

    public PFNvkGetSwapchainCounterEXT(VkInstance instance) {
        super(instance, new VkString("vkGetSwapchainCounterEXT"));
    }

    public void call(VkDevice device, VkSwapchainKHR swapchain, VkSurfaceCounterFlagBitsEXT counter, VkUInt64 pCounterValue, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddressNative(), counter != null ? counter.getVkAddress() : VkPointer.getNullAddressNative(), pCounterValue != null ? pCounterValue.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long swapchain, long counter, long pCounterValue, long rval);


    public int call(VkDevice device, VkSwapchainKHR swapchain, int counter, VkUInt64 pCounterValue){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddressNative(), counter, pCounterValue != null ? pCounterValue.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long swapchain, int counter, long pCounterValue);

}

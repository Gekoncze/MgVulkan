package cz.mg.vulkan;

public class PFNvkGetPastPresentationTimingGOOGLE extends VkFunctionPointer {
    public PFNvkGetPastPresentationTimingGOOGLE() {
    }

    protected PFNvkGetPastPresentationTimingGOOGLE(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPastPresentationTimingGOOGLE(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPastPresentationTimingGOOGLE(long value) {
        setValue(value);
    }

    public PFNvkGetPastPresentationTimingGOOGLE(VkInstance instance) {
        super(instance, new VkString("vkGetPastPresentationTimingGOOGLE"));
    }

    public void call(VkDevice device, VkSwapchainKHR swapchain, VkUInt32 pPresentationTimingCount, VkPastPresentationTimingGOOGLE pPresentationTimings, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddressNative(), pPresentationTimingCount != null ? pPresentationTimingCount.getVkAddress() : VkPointer.NULL, pPresentationTimings != null ? pPresentationTimings.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long swapchain, long pPresentationTimingCount, long pPresentationTimings, long rval);


    public int call(VkDevice device, VkSwapchainKHR swapchain, VkUInt32 pPresentationTimingCount, VkPastPresentationTimingGOOGLE pPresentationTimings){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddressNative(), pPresentationTimingCount != null ? pPresentationTimingCount.getVkAddress() : VkPointer.NULL, pPresentationTimings != null ? pPresentationTimings.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long swapchain, long pPresentationTimingCount, long pPresentationTimings);

}

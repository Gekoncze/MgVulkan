package cz.mg.vulkan;

public class PFNvkGetRefreshCycleDurationGOOGLE extends VkFunctionPointer {
    public PFNvkGetRefreshCycleDurationGOOGLE() {
    }

    protected PFNvkGetRefreshCycleDurationGOOGLE(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetRefreshCycleDurationGOOGLE(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetRefreshCycleDurationGOOGLE(long value) {
        setValue(value);
    }

    public PFNvkGetRefreshCycleDurationGOOGLE(VkInstance instance) {
        super(instance, new VkString("vkGetRefreshCycleDurationGOOGLE"));
    }

    public void call(VkDevice device, VkSwapchainKHR swapchain, VkRefreshCycleDurationGOOGLE pDisplayTimingProperties, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddressNative(), pDisplayTimingProperties != null ? pDisplayTimingProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long swapchain, long pDisplayTimingProperties, long rval);


    public int call(VkDevice device, VkSwapchainKHR swapchain, VkRefreshCycleDurationGOOGLE pDisplayTimingProperties){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddressNative(), pDisplayTimingProperties != null ? pDisplayTimingProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long swapchain, long pDisplayTimingProperties);

}

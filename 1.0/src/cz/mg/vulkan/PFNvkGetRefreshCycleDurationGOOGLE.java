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

    public int call(VkDevice device, VkSwapchainKHR swapchain, VkRefreshCycleDurationGOOGLE pDisplayTimingProperties){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddressNative(), pDisplayTimingProperties != null ? pDisplayTimingProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long swapchain, long pDisplayTimingProperties);

}

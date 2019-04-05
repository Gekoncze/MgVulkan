package cz.mg.vulkan.vk;

public class PFNvkGetRefreshCycleDurationGOOGLE extends VkFunctionPointer {
    public PFNvkGetRefreshCycleDurationGOOGLE() {
    }

    public PFNvkGetRefreshCycleDurationGOOGLE(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetRefreshCycleDurationGOOGLE(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetRefreshCycleDurationGOOGLE(long value) {
        setValue(value);
    }

    public PFNvkGetRefreshCycleDurationGOOGLE(VkInstance instance) {
        super(instance, new VkString("vkGetRefreshCycleDurationGOOGLE"));
    }

    public void call(VkDevice device, VkSwapchainKHR swapchain, VkRefreshCycleDurationGOOGLE pDisplayTimingProperties, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, swapchain != null ? swapchain.getVkAddress() : VkPointer.NULL_ADDRESS, pDisplayTimingProperties != null ? pDisplayTimingProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long swapchain, long pDisplayTimingProperties, long rval);
}

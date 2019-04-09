package cz.mg.vulkan;

public class PFNvkCreateSharedSwapchainsKHR extends VkFunctionPointer {
    public PFNvkCreateSharedSwapchainsKHR() {
    }

    public PFNvkCreateSharedSwapchainsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateSharedSwapchainsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateSharedSwapchainsKHR(long value) {
        setValue(value);
    }

    public PFNvkCreateSharedSwapchainsKHR(VkInstance instance) {
        super(instance, new VkString("vkCreateSharedSwapchainsKHR"));
    }

    public void call(VkDevice device, VkUInt32 swapchainCount, VkSwapchainCreateInfoKHR pCreateInfos, VkAllocationCallbacks pAllocator, VkSwapchainKHR pSwapchains, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, swapchainCount != null ? swapchainCount.getVkAddress() : VkPointer.NULL_ADDRESS, pCreateInfos != null ? pCreateInfos.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSwapchains != null ? pSwapchains.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long swapchainCount, long pCreateInfos, long pAllocator, long pSwapchains, long rval);
}

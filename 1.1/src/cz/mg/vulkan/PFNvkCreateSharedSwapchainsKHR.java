package cz.mg.vulkan;

public class PFNvkCreateSharedSwapchainsKHR extends VkFunctionPointer {
    public PFNvkCreateSharedSwapchainsKHR() {
    }

    protected PFNvkCreateSharedSwapchainsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateSharedSwapchainsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateSharedSwapchainsKHR(long value) {
        setValue(value);
    }

    public PFNvkCreateSharedSwapchainsKHR(VkInstance instance) {
        super(instance, new VkString("vkCreateSharedSwapchainsKHR"));
    }

    public void call(VkDevice device, VkUInt32 swapchainCount, VkSwapchainCreateInfoKHR pCreateInfos, VkAllocationCallbacks pAllocator, VkSwapchainKHR pSwapchains, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchainCount != null ? swapchainCount.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfos != null ? pCreateInfos.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSwapchains != null ? pSwapchains.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long swapchainCount, long pCreateInfos, long pAllocator, long pSwapchains, long rval);


    public int call(VkDevice device, int swapchainCount, VkSwapchainCreateInfoKHR pCreateInfos, VkAllocationCallbacks pAllocator, VkSwapchainKHR pSwapchains){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchainCount, pCreateInfos != null ? pCreateInfos.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSwapchains != null ? pSwapchains.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, int swapchainCount, long pCreateInfos, long pAllocator, long pSwapchains);

}

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

    public int call(VkDevice device, int swapchainCount, VkSwapchainCreateInfoKHR pCreateInfos, VkAllocationCallbacks pAllocator, VkSwapchainKHR pSwapchains){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchainCount, pCreateInfos != null ? pCreateInfos.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSwapchains != null ? pSwapchains.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, int swapchainCount, long pCreateInfos, long pAllocator, long pSwapchains);

}

package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateSharedSwapchainsKHR.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), swapchainCount != null ? swapchainCount.getVkAddress() : VkPointer.NULL, pCreateInfos != null ? pCreateInfos.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSwapchains != null ? pSwapchains.getVkAddress() : VkSwapchainKHR.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long swapchainCount, long pCreateInfos, long pAllocator, long pSwapchains, long rval);
}

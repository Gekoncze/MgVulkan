package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPastPresentationTimingGOOGLE.html">khronos documentation</a>
 **/
public class PFNvkGetPastPresentationTimingGOOGLE extends VkFunctionPointer {
    public PFNvkGetPastPresentationTimingGOOGLE() {
    }

    public PFNvkGetPastPresentationTimingGOOGLE(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPastPresentationTimingGOOGLE(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPastPresentationTimingGOOGLE(long value) {
        setValue(value);
    }

    public PFNvkGetPastPresentationTimingGOOGLE(VkInstance instance) {
        super(instance, new VkString("vkGetPastPresentationTimingGOOGLE"));
    }

    public void call(VkDevice device, VkSwapchainKHR swapchain, VkUInt32 pPresentationTimingCount, VkPastPresentationTimingGOOGLE pPresentationTimings, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, swapchain != null ? swapchain.getVkAddress() : VkPointer.NULL_ADDRESS, pPresentationTimingCount != null ? pPresentationTimingCount.getVkAddress() : VkPointer.NULL, pPresentationTimings != null ? pPresentationTimings.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long swapchain, long pPresentationTimingCount, long pPresentationTimings, long rval);
}

package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateSwapchainKHR.html">khronos documentation</a>
 **/
public class PFNvkCreateSwapchainKHR extends VkFunctionPointer {
    public PFNvkCreateSwapchainKHR() {
    }

    public PFNvkCreateSwapchainKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateSwapchainKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateSwapchainKHR(long value) {
        setValue(value);
    }

    public PFNvkCreateSwapchainKHR(VkInstance instance) {
        super(instance, new VkString("vkCreateSwapchainKHR"));
    }

    public void call(VkDevice device, VkSwapchainCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkSwapchainKHR pSwapchain, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSwapchain != null ? pSwapchain.getVkAddress() : VkSwapchainKHR.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pSwapchain, long rval);
}

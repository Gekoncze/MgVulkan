package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroySwapchainKHR.html">khronos documentation</a>
 **/
public class PFNvkDestroySwapchainKHR extends VkFunctionPointer {
    public PFNvkDestroySwapchainKHR() {
    }

    public PFNvkDestroySwapchainKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroySwapchainKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroySwapchainKHR(long value) {
        setValue(value);
    }

    public PFNvkDestroySwapchainKHR(VkInstance instance) {
        super(instance, new VkString("vkDestroySwapchainKHR"));
    }

    public void call(VkDevice device, VkSwapchainKHR swapchain, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), swapchain != null ? swapchain.getVkAddress() : VkSwapchainKHR.NULL.getVkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long swapchain, long pAllocator);
}

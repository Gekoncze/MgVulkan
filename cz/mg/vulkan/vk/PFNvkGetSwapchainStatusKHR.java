package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetSwapchainStatusKHR.html">khronos documentation</a>
 **/
public class PFNvkGetSwapchainStatusKHR extends VkFunctionPointer {
    public PFNvkGetSwapchainStatusKHR() {
    }

    public PFNvkGetSwapchainStatusKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetSwapchainStatusKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetSwapchainStatusKHR(long value) {
        setValue(value);
    }

    public PFNvkGetSwapchainStatusKHR(VkInstance instance) {
        super(instance, new VkString("vkGetSwapchainStatusKHR"));
    }

    public void call(VkDevice device, VkSwapchainKHR swapchain, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), swapchain != null ? swapchain.getVkAddress() : VkSwapchainKHR.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long swapchain, long rval);
}

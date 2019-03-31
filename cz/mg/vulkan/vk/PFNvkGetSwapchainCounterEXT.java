package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetSwapchainCounterEXT.html">khronos documentation</a>
 **/
public class PFNvkGetSwapchainCounterEXT extends VkFunctionPointer {
    public PFNvkGetSwapchainCounterEXT() {
    }

    public PFNvkGetSwapchainCounterEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetSwapchainCounterEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetSwapchainCounterEXT(long value) {
        setValue(value);
    }

    public PFNvkGetSwapchainCounterEXT(VkInstance instance) {
        super(instance, new VkString("vkGetSwapchainCounterEXT"));
    }

    public void call(VkDevice device, VkSwapchainKHR swapchain, VkSurfaceCounterFlagBitsEXT counter, VkUInt64 pCounterValue, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), swapchain != null ? swapchain.getVkAddress() : VkSwapchainKHR.NULL.getVkAddress(), counter != null ? counter.getVkAddress() : VkPointer.NULL, pCounterValue != null ? pCounterValue.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long swapchain, long counter, long pCounterValue, long rval);
}

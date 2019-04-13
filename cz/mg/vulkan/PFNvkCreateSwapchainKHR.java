package cz.mg.vulkan;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSwapchain != null ? pSwapchain.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pSwapchain, long rval);
}

package cz.mg.vulkan;

public class PFNvkDestroySwapchainKHR extends VkFunctionPointer {
    public PFNvkDestroySwapchainKHR() {
    }

    protected PFNvkDestroySwapchainKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroySwapchainKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroySwapchainKHR(long value) {
        setValue(value);
    }

    public PFNvkDestroySwapchainKHR(VkInstance instance) {
        super(instance, new VkString("vkDestroySwapchainKHR"));
    }

    public void call(VkDevice device, VkSwapchainKHR swapchain, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long swapchain, long pAllocator);
}

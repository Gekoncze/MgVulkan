package cz.mg.vulkan;

public class PFNvkCreateSwapchainKHR extends VkFunctionPointer {
    public PFNvkCreateSwapchainKHR() {
    }

    protected PFNvkCreateSwapchainKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateSwapchainKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateSwapchainKHR(long value) {
        setValue(value);
    }

    public PFNvkCreateSwapchainKHR(VkInstance instance) {
        super(instance, new VkString("vkCreateSwapchainKHR"));
    }

    public int call(VkDevice device, VkSwapchainCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkSwapchainKHR pSwapchain){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSwapchain != null ? pSwapchain.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pSwapchain);

}

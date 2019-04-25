package cz.mg.vulkan;

public class PFNvkGetSwapchainStatusKHR extends VkFunctionPointer {
    public PFNvkGetSwapchainStatusKHR() {
    }

    protected PFNvkGetSwapchainStatusKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetSwapchainStatusKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetSwapchainStatusKHR(long value) {
        setValue(value);
    }

    public PFNvkGetSwapchainStatusKHR(VkInstance instance) {
        super(instance, new VkString("vkGetSwapchainStatusKHR"));
    }

    public void call(VkDevice device, VkSwapchainKHR swapchain, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long swapchain, long rval);
}

package cz.mg.vulkan;

public class PFNvkGetSwapchainImagesKHR extends VkFunctionPointer {
    public PFNvkGetSwapchainImagesKHR() {
    }

    protected PFNvkGetSwapchainImagesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetSwapchainImagesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetSwapchainImagesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetSwapchainImagesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetSwapchainImagesKHR"));
    }

    public void call(VkDevice device, VkSwapchainKHR swapchain, VkUInt32 pSwapchainImageCount, VkImage pSwapchainImages, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddressNative(), pSwapchainImageCount != null ? pSwapchainImageCount.getVkAddress() : VkPointer.NULL, pSwapchainImages != null ? pSwapchainImages.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long swapchain, long pSwapchainImageCount, long pSwapchainImages, long rval);
}

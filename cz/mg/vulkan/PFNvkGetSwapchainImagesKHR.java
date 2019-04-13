package cz.mg.vulkan;

public class PFNvkGetSwapchainImagesKHR extends VkFunctionPointer {
    public PFNvkGetSwapchainImagesKHR() {
    }

    public PFNvkGetSwapchainImagesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetSwapchainImagesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetSwapchainImagesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetSwapchainImagesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetSwapchainImagesKHR"));
    }

    public void call(VkDevice device, VkSwapchainKHR swapchain, VkUInt32 pSwapchainImageCount, VkImage pSwapchainImages, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getSinkAddress(), pSwapchainImageCount != null ? pSwapchainImageCount.getVkAddress() : VkPointer.NULL, pSwapchainImages != null ? pSwapchainImages.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long swapchain, long pSwapchainImageCount, long pSwapchainImages, long rval);
}

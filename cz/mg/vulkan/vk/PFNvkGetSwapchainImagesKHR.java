package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetSwapchainImagesKHR.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), swapchain != null ? swapchain.getVkAddress() : VkSwapchainKHR.NULL.getVkAddress(), pSwapchainImageCount != null ? pSwapchainImageCount.getVkAddress() : VkPointer.NULL, pSwapchainImages != null ? pSwapchainImages.getVkAddress() : VkImage.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long swapchain, long pSwapchainImageCount, long pSwapchainImages, long rval);
}

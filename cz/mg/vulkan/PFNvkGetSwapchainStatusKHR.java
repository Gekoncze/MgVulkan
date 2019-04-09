package cz.mg.vulkan;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, swapchain != null ? swapchain.getVkAddress() : VkPointer.NULL_ADDRESS, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long swapchain, long rval);
}

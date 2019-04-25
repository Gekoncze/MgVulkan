package cz.mg.vulkan;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddress(), counter != null ? counter.getVkAddress() : VkPointer.getNullAddress(), pCounterValue != null ? pCounterValue.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    protected static native void call(long vkaddress, long device, long swapchain, long counter, long pCounterValue, long rval);
}

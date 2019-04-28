package cz.mg.vulkan;

public class PFNvkGetSwapchainCounterEXT extends VkFunctionPointer {
    public PFNvkGetSwapchainCounterEXT() {
    }

    protected PFNvkGetSwapchainCounterEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetSwapchainCounterEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetSwapchainCounterEXT(long value) {
        setValue(value);
    }

    public PFNvkGetSwapchainCounterEXT(VkInstance instance) {
        super(instance, new VkString("vkGetSwapchainCounterEXT"));
    }

    public int call(VkDevice device, VkSwapchainKHR swapchain, int counter, VkUInt64 pCounterValue){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddressNative(), counter, pCounterValue != null ? pCounterValue.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long swapchain, int counter, long pCounterValue);

}

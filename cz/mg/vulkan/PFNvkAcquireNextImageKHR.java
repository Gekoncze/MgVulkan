package cz.mg.vulkan;

public class PFNvkAcquireNextImageKHR extends VkFunctionPointer {
    public PFNvkAcquireNextImageKHR() {
    }

    public PFNvkAcquireNextImageKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkAcquireNextImageKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkAcquireNextImageKHR(long value) {
        setValue(value);
    }

    public PFNvkAcquireNextImageKHR(VkInstance instance) {
        super(instance, new VkString("vkAcquireNextImageKHR"));
    }

    public void call(VkDevice device, VkSwapchainKHR swapchain, VkUInt64 timeout, VkSemaphore semaphore, VkFence fence, VkUInt32 pImageIndex, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddress(), timeout != null ? timeout.getVkAddress() : VkPointer.getNullAddress(), semaphore != null ? semaphore.getVkAddress() : VkPointer.getNullAddress(), fence != null ? fence.getVkAddress() : VkPointer.getNullAddress(), pImageIndex != null ? pImageIndex.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long swapchain, long timeout, long semaphore, long fence, long pImageIndex, long rval);
}

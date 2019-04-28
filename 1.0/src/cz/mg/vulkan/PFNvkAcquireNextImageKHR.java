package cz.mg.vulkan;

public class PFNvkAcquireNextImageKHR extends VkFunctionPointer {
    public PFNvkAcquireNextImageKHR() {
    }

    protected PFNvkAcquireNextImageKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkAcquireNextImageKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkAcquireNextImageKHR(long value) {
        setValue(value);
    }

    public PFNvkAcquireNextImageKHR(VkInstance instance) {
        super(instance, new VkString("vkAcquireNextImageKHR"));
    }

    public int call(VkDevice device, VkSwapchainKHR swapchain, long timeout, VkSemaphore semaphore, VkFence fence, VkUInt32 pImageIndex){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddressNative(), timeout, semaphore != null ? semaphore.getVkAddress() : VkPointer.getNullAddressNative(), fence != null ? fence.getVkAddress() : VkPointer.getNullAddressNative(), pImageIndex != null ? pImageIndex.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long swapchain, long timeout, long semaphore, long fence, long pImageIndex);

}

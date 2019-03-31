package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkAcquireNextImageKHR.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), swapchain != null ? swapchain.getVkAddress() : VkSwapchainKHR.NULL.getVkAddress(), timeout != null ? timeout.getVkAddress() : VkPointer.NULL, semaphore != null ? semaphore.getVkAddress() : VkSemaphore.NULL.getVkAddress(), fence != null ? fence.getVkAddress() : VkFence.NULL.getVkAddress(), pImageIndex != null ? pImageIndex.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long swapchain, long timeout, long semaphore, long fence, long pImageIndex, long rval);
}

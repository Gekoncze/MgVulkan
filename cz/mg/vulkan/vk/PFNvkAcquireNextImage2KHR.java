package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkAcquireNextImage2KHR.html">khronos documentation</a>
 **/
public class PFNvkAcquireNextImage2KHR extends VkFunctionPointer {
    public PFNvkAcquireNextImage2KHR() {
    }

    public PFNvkAcquireNextImage2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkAcquireNextImage2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkAcquireNextImage2KHR(long value) {
        setValue(value);
    }

    public PFNvkAcquireNextImage2KHR(VkInstance instance) {
        super(instance, new VkString("vkAcquireNextImage2KHR"));
    }

    public void call(VkDevice device, VkAcquireNextImageInfoKHR pAcquireInfo, VkUInt32 pImageIndex, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pAcquireInfo != null ? pAcquireInfo.getVkAddress() : VkPointer.NULL, pImageIndex != null ? pImageIndex.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pAcquireInfo, long pImageIndex, long rval);
}

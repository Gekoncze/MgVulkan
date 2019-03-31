package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetSemaphoreFdKHR.html">khronos documentation</a>
 **/
public class PFNvkGetSemaphoreFdKHR extends VkFunctionPointer {
    public PFNvkGetSemaphoreFdKHR() {
    }

    public PFNvkGetSemaphoreFdKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetSemaphoreFdKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetSemaphoreFdKHR(long value) {
        setValue(value);
    }

    public PFNvkGetSemaphoreFdKHR(VkInstance instance) {
        super(instance, new VkString("vkGetSemaphoreFdKHR"));
    }

    public void call(VkDevice device, VkSemaphoreGetFdInfoKHR pGetFdInfo, VkInt pFd, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pGetFdInfo != null ? pGetFdInfo.getVkAddress() : VkPointer.NULL, pFd != null ? pFd.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pGetFdInfo, long pFd, long rval);
}

package cz.mg.vulkan;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pGetFdInfo != null ? pGetFdInfo.getVkAddress() : VkPointer.NULL, pFd != null ? pFd.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pGetFdInfo, long pFd, long rval);
}

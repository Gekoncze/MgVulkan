package cz.mg.vulkan;

public class PFNvkGetSemaphoreFdKHR extends VkFunctionPointer {
    public PFNvkGetSemaphoreFdKHR() {
    }

    protected PFNvkGetSemaphoreFdKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetSemaphoreFdKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetSemaphoreFdKHR(long value) {
        setValue(value);
    }

    public PFNvkGetSemaphoreFdKHR(VkInstance instance) {
        super(instance, new VkString("vkGetSemaphoreFdKHR"));
    }

    public void call(VkDevice device, VkSemaphoreGetFdInfoKHR pGetFdInfo, VkInt pFd, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pGetFdInfo != null ? pGetFdInfo.getVkAddress() : VkPointer.NULL, pFd != null ? pFd.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pGetFdInfo, long pFd, long rval);


    public int call(VkDevice device, VkSemaphoreGetFdInfoKHR pGetFdInfo, VkInt pFd){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pGetFdInfo != null ? pGetFdInfo.getVkAddress() : VkPointer.NULL, pFd != null ? pFd.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pGetFdInfo, long pFd);

}

package cz.mg.vulkan;

public class PFNvkGetFenceFdKHR extends VkFunctionPointer {
    public PFNvkGetFenceFdKHR() {
    }

    protected PFNvkGetFenceFdKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetFenceFdKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetFenceFdKHR(long value) {
        setValue(value);
    }

    public PFNvkGetFenceFdKHR(VkInstance instance) {
        super(instance, new VkString("vkGetFenceFdKHR"));
    }

    public int call(VkDevice device, VkFenceGetFdInfoKHR pGetFdInfo, VkInt pFd){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pGetFdInfo != null ? pGetFdInfo.getVkAddress() : VkPointer.NULL, pFd != null ? pFd.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pGetFdInfo, long pFd);

}

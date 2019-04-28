package cz.mg.vulkan;

public class PFNvkGetMemoryFdKHR extends VkFunctionPointer {
    public PFNvkGetMemoryFdKHR() {
    }

    protected PFNvkGetMemoryFdKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetMemoryFdKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetMemoryFdKHR(long value) {
        setValue(value);
    }

    public PFNvkGetMemoryFdKHR(VkInstance instance) {
        super(instance, new VkString("vkGetMemoryFdKHR"));
    }

    public int call(VkDevice device, VkMemoryGetFdInfoKHR pGetFdInfo, VkInt pFd){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pGetFdInfo != null ? pGetFdInfo.getVkAddress() : VkPointer.NULL, pFd != null ? pFd.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pGetFdInfo, long pFd);

}

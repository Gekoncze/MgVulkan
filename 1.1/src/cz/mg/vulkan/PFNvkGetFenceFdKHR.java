package cz.mg.vulkan;

public class PFNvkGetFenceFdKHR extends VkFunctionPointer {
    public PFNvkGetFenceFdKHR() {
    }

    public PFNvkGetFenceFdKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetFenceFdKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetFenceFdKHR(long value) {
        setValue(value);
    }

    public PFNvkGetFenceFdKHR(VkInstance instance) {
        super(instance, new VkString("vkGetFenceFdKHR"));
    }

    public void call(VkDevice device, VkFenceGetFdInfoKHR pGetFdInfo, VkInt pFd, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pGetFdInfo != null ? pGetFdInfo.getVkAddress() : VkPointer.NULL, pFd != null ? pFd.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long pGetFdInfo, long pFd, long rval);
}

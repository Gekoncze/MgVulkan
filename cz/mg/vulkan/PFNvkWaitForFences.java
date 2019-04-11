package cz.mg.vulkan;

public class PFNvkWaitForFences extends VkFunctionPointer {
    public PFNvkWaitForFences() {
    }

    public PFNvkWaitForFences(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkWaitForFences(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkWaitForFences(long value) {
        setValue(value);
    }

    public PFNvkWaitForFences(VkInstance instance) {
        super(instance, new VkString("vkWaitForFences"));
    }

    public void call(VkDevice device, VkUInt32 fenceCount, VkFence pFences, VkBool32 waitAll, VkUInt64 timeout, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), fenceCount != null ? fenceCount.getVkAddress() : VkPointer.getNullAddress(), pFences != null ? pFences.getVkAddress() : VkPointer.NULL, waitAll != null ? waitAll.getVkAddress() : VkPointer.getNullAddress(), timeout != null ? timeout.getVkAddress() : VkPointer.getNullAddress(), rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long device, long fenceCount, long pFences, long waitAll, long timeout, long rval);
}

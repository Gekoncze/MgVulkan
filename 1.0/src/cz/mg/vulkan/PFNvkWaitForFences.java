package cz.mg.vulkan;

public class PFNvkWaitForFences extends VkFunctionPointer {
    public PFNvkWaitForFences() {
    }

    protected PFNvkWaitForFences(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkWaitForFences(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkWaitForFences(long value) {
        setValue(value);
    }

    public PFNvkWaitForFences(VkInstance instance) {
        super(instance, new VkString("vkWaitForFences"));
    }

    public void call(VkDevice device, VkUInt32 fenceCount, VkFence pFences, VkBool32 waitAll, VkUInt64 timeout, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), fenceCount != null ? fenceCount.getVkAddress() : VkPointer.getNullAddressNative(), pFences != null ? pFences.getVkAddress() : VkPointer.NULL, waitAll != null ? waitAll.getVkAddress() : VkPointer.getNullAddressNative(), timeout != null ? timeout.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long fenceCount, long pFences, long waitAll, long timeout, long rval);


    public int call(VkDevice device, int fenceCount, VkFence pFences, int waitAll, long timeout){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), fenceCount, pFences != null ? pFences.getVkAddress() : VkPointer.NULL, waitAll, timeout);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, int fenceCount, long pFences, int waitAll, long timeout);

}

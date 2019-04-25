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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), fenceCount != null ? fenceCount.getVkAddress() : VkPointer.getNullAddressNative(), pFences != null ? pFences.getVkAddress() : VkPointer.NULL, waitAll != null ? waitAll.getVkAddress() : VkPointer.getNullAddressNative(), timeout != null ? timeout.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long fenceCount, long pFences, long waitAll, long timeout, long rval);
}

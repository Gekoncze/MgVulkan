package cz.mg.vulkan;

public class PFNvkResetFences extends VkFunctionPointer {
    public PFNvkResetFences() {
    }

    protected PFNvkResetFences(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkResetFences(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkResetFences(long value) {
        setValue(value);
    }

    public PFNvkResetFences(VkInstance instance) {
        super(instance, new VkString("vkResetFences"));
    }

    public void call(VkDevice device, VkUInt32 fenceCount, VkFence pFences, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), fenceCount != null ? fenceCount.getVkAddress() : VkPointer.getNullAddressNative(), pFences != null ? pFences.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long fenceCount, long pFences, long rval);


    public int call(VkDevice device, int fenceCount, VkFence pFences){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), fenceCount, pFences != null ? pFences.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, int fenceCount, long pFences);

}

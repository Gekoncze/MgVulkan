package cz.mg.vulkan;

public class PFNvkQueueSubmit extends VkFunctionPointer {
    public PFNvkQueueSubmit() {
    }

    protected PFNvkQueueSubmit(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkQueueSubmit(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkQueueSubmit(long value) {
        setValue(value);
    }

    public PFNvkQueueSubmit(VkInstance instance) {
        super(instance, new VkString("vkQueueSubmit"));
    }

    public void call(VkQueue queue, VkUInt32 submitCount, VkSubmitInfo pSubmits, VkFence fence, VkResult rval){
        callNative(getValue(), queue != null ? queue.getVkAddress() : VkPointer.getNullAddressNative(), submitCount != null ? submitCount.getVkAddress() : VkPointer.getNullAddressNative(), pSubmits != null ? pSubmits.getVkAddress() : VkPointer.NULL, fence != null ? fence.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long queue, long submitCount, long pSubmits, long fence, long rval);


    public int call(VkQueue queue, int submitCount, VkSubmitInfo pSubmits, VkFence fence){
        return callSimplifiedNative(getValue(), queue != null ? queue.getVkAddress() : VkPointer.getNullAddressNative(), submitCount, pSubmits != null ? pSubmits.getVkAddress() : VkPointer.NULL, fence != null ? fence.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native int callSimplifiedNative(long vkaddress, long queue, int submitCount, long pSubmits, long fence);

}

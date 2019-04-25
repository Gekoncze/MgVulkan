package cz.mg.vulkan;

public class PFNvkQueueBindSparse extends VkFunctionPointer {
    public PFNvkQueueBindSparse() {
    }

    protected PFNvkQueueBindSparse(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkQueueBindSparse(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkQueueBindSparse(long value) {
        setValue(value);
    }

    public PFNvkQueueBindSparse(VkInstance instance) {
        super(instance, new VkString("vkQueueBindSparse"));
    }

    public void call(VkQueue queue, VkUInt32 bindInfoCount, VkBindSparseInfo pBindInfo, VkFence fence, VkResult rval){
        call(getValue(), queue != null ? queue.getVkAddress() : VkPointer.getNullAddressNative(), bindInfoCount != null ? bindInfoCount.getVkAddress() : VkPointer.getNullAddressNative(), pBindInfo != null ? pBindInfo.getVkAddress() : VkPointer.NULL, fence != null ? fence.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long queue, long bindInfoCount, long pBindInfo, long fence, long rval);
}

package cz.mg.vulkan;

public class PFNvkQueueBindSparse extends VkFunctionPointer {
    public PFNvkQueueBindSparse() {
    }

    public PFNvkQueueBindSparse(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkQueueBindSparse(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkQueueBindSparse(long value) {
        setValue(value);
    }

    public PFNvkQueueBindSparse(VkInstance instance) {
        super(instance, new VkString("vkQueueBindSparse"));
    }

    public void call(VkQueue queue, VkUInt32 bindInfoCount, VkBindSparseInfo pBindInfo, VkFence fence, VkResult rval){
        call(getValue(), queue != null ? queue.getVkAddress() : VkPointer.getSinkAddress(), bindInfoCount != null ? bindInfoCount.getVkAddress() : VkPointer.getSinkAddress(), pBindInfo != null ? pBindInfo.getVkAddress() : VkPointer.NULL, fence != null ? fence.getVkAddress() : VkPointer.getSinkAddress(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long queue, long bindInfoCount, long pBindInfo, long fence, long rval);
}

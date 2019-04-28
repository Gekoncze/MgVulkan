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

    public int call(VkQueue queue, int bindInfoCount, VkBindSparseInfo pBindInfo, VkFence fence){
        return callNative(getValue(), queue != null ? queue.getVkAddress() : VkPointer.getNullAddressNative(), bindInfoCount, pBindInfo != null ? pBindInfo.getVkAddress() : VkPointer.NULL, fence != null ? fence.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native int callNative(long vkaddress, long queue, int bindInfoCount, long pBindInfo, long fence);

}

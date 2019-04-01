package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkQueueBindSparse.html">khronos documentation</a>
 **/
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
        call(getValue(), queue != null ? queue.getVkAddress() : VkPointer.NULL_ADDRESS, bindInfoCount != null ? bindInfoCount.getVkAddress() : VkPointer.NULL_ADDRESS, pBindInfo != null ? pBindInfo.getVkAddress() : VkPointer.NULL, fence != null ? fence.getVkAddress() : VkPointer.NULL_ADDRESS, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long queue, long bindInfoCount, long pBindInfo, long fence, long rval);
}

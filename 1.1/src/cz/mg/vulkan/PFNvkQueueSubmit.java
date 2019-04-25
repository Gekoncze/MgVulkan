package cz.mg.vulkan;

public class PFNvkQueueSubmit extends VkFunctionPointer {
    public PFNvkQueueSubmit() {
    }

    public PFNvkQueueSubmit(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkQueueSubmit(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkQueueSubmit(long value) {
        setValue(value);
    }

    public PFNvkQueueSubmit(VkInstance instance) {
        super(instance, new VkString("vkQueueSubmit"));
    }

    public void call(VkQueue queue, VkUInt32 submitCount, VkSubmitInfo pSubmits, VkFence fence, VkResult rval){
        call(getValue(), queue != null ? queue.getVkAddress() : VkPointer.getNullAddress(), submitCount != null ? submitCount.getVkAddress() : VkPointer.getNullAddress(), pSubmits != null ? pSubmits.getVkAddress() : VkPointer.NULL, fence != null ? fence.getVkAddress() : VkPointer.getNullAddress(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    protected static native void call(long vkaddress, long queue, long submitCount, long pSubmits, long fence, long rval);
}

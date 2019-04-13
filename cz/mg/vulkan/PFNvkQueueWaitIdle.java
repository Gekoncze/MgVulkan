package cz.mg.vulkan;

public class PFNvkQueueWaitIdle extends VkFunctionPointer {
    public PFNvkQueueWaitIdle() {
    }

    public PFNvkQueueWaitIdle(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkQueueWaitIdle(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkQueueWaitIdle(long value) {
        setValue(value);
    }

    public PFNvkQueueWaitIdle(VkInstance instance) {
        super(instance, new VkString("vkQueueWaitIdle"));
    }

    public void call(VkQueue queue, VkResult rval){
        call(getValue(), queue != null ? queue.getVkAddress() : VkPointer.getSinkAddress(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long queue, long rval);
}

package cz.mg.vulkan.vk;

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
        call(getValue(), queue != null ? queue.getVkAddress() : VkPointer.NULL_ADDRESS, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long queue, long rval);
}

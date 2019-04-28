package cz.mg.vulkan;

public class PFNvkQueueWaitIdle extends VkFunctionPointer {
    public PFNvkQueueWaitIdle() {
    }

    protected PFNvkQueueWaitIdle(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkQueueWaitIdle(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkQueueWaitIdle(long value) {
        setValue(value);
    }

    public PFNvkQueueWaitIdle(VkInstance instance) {
        super(instance, new VkString("vkQueueWaitIdle"));
    }

    public int call(VkQueue queue){
        return callNative(getValue(), queue != null ? queue.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native int callNative(long vkaddress, long queue);

}

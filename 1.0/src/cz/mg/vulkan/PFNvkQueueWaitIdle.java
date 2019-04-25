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

    public void call(VkQueue queue, VkResult rval){
        call(getValue(), queue != null ? queue.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long queue, long rval);
}

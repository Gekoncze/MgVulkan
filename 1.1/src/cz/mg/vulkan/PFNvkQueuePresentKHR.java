package cz.mg.vulkan;

public class PFNvkQueuePresentKHR extends VkFunctionPointer {
    public PFNvkQueuePresentKHR() {
    }

    protected PFNvkQueuePresentKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkQueuePresentKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkQueuePresentKHR(long value) {
        setValue(value);
    }

    public PFNvkQueuePresentKHR(VkInstance instance) {
        super(instance, new VkString("vkQueuePresentKHR"));
    }

    public void call(VkQueue queue, VkPresentInfoKHR pPresentInfo, VkResult rval){
        call(getValue(), queue != null ? queue.getVkAddress() : VkPointer.getNullAddressNative(), pPresentInfo != null ? pPresentInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long queue, long pPresentInfo, long rval);
}

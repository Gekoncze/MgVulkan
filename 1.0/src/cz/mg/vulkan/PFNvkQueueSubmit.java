package cz.mg.vulkan;

public class PFNvkQueueSubmit extends VkFunctionPointer {
    public PFNvkQueueSubmit() {
    }

    protected PFNvkQueueSubmit(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkQueueSubmit(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkQueueSubmit(long value) {
        setValue(value);
    }

    public PFNvkQueueSubmit(VkInstance instance) {
        super(instance, new VkString("vkQueueSubmit"));
    }

    public int call(VkQueue queue, int submitCount, VkSubmitInfo pSubmits, VkFence fence){
        return callNative(getValue(), queue != null ? queue.getVkAddress() : VkPointer.getNullAddressNative(), submitCount, pSubmits != null ? pSubmits.getVkAddress() : VkPointer.NULL, fence != null ? fence.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native int callNative(long vkaddress, long queue, int submitCount, long pSubmits, long fence);

}

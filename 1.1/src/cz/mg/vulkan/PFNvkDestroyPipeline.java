package cz.mg.vulkan;

public class PFNvkDestroyPipeline extends VkFunctionPointer {
    public PFNvkDestroyPipeline() {
    }

    protected PFNvkDestroyPipeline(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyPipeline(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyPipeline(long value) {
        setValue(value);
    }

    public PFNvkDestroyPipeline(VkInstance instance) {
        super(instance, new VkString("vkDestroyPipeline"));
    }

    public void call(VkDevice device, VkPipeline pipeline, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pipeline != null ? pipeline.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long pipeline, long pAllocator);

}

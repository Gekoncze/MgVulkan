package cz.mg.vulkan;

public class PFNvkDestroyPipelineCache extends VkFunctionPointer {
    public PFNvkDestroyPipelineCache() {
    }

    protected PFNvkDestroyPipelineCache(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyPipelineCache(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyPipelineCache(long value) {
        setValue(value);
    }

    public PFNvkDestroyPipelineCache(VkInstance instance) {
        super(instance, new VkString("vkDestroyPipelineCache"));
    }

    public void call(VkDevice device, VkPipelineCache pipelineCache, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pipelineCache != null ? pipelineCache.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long pipelineCache, long pAllocator);



}

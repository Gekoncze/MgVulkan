package cz.mg.vulkan;

public class PFNvkDestroyPipelineCache extends VkFunctionPointer {
    public PFNvkDestroyPipelineCache() {
    }

    public PFNvkDestroyPipelineCache(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyPipelineCache(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyPipelineCache(long value) {
        setValue(value);
    }

    public PFNvkDestroyPipelineCache(VkInstance instance) {
        super(instance, new VkString("vkDestroyPipelineCache"));
    }

    public void call(VkDevice device, VkPipelineCache pipelineCache, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pipelineCache != null ? pipelineCache.getVkAddress() : VkPointer.getNullAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pipelineCache, long pAllocator);
}

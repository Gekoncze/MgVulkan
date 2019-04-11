package cz.mg.vulkan;

public class PFNvkCreatePipelineCache extends VkFunctionPointer {
    public PFNvkCreatePipelineCache() {
    }

    public PFNvkCreatePipelineCache(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreatePipelineCache(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreatePipelineCache(long value) {
        setValue(value);
    }

    public PFNvkCreatePipelineCache(VkInstance instance) {
        super(instance, new VkString("vkCreatePipelineCache"));
    }

    public void call(VkDevice device, VkPipelineCacheCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkPipelineCache pPipelineCache, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pPipelineCache != null ? pPipelineCache.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pPipelineCache, long rval);
}

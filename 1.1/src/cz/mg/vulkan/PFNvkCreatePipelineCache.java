package cz.mg.vulkan;

public class PFNvkCreatePipelineCache extends VkFunctionPointer {
    public PFNvkCreatePipelineCache() {
    }

    protected PFNvkCreatePipelineCache(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreatePipelineCache(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreatePipelineCache(long value) {
        setValue(value);
    }

    public PFNvkCreatePipelineCache(VkInstance instance) {
        super(instance, new VkString("vkCreatePipelineCache"));
    }

    public void call(VkDevice device, VkPipelineCacheCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkPipelineCache pPipelineCache, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pPipelineCache != null ? pPipelineCache.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pPipelineCache, long rval);


    public int call(VkDevice device, VkPipelineCacheCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkPipelineCache pPipelineCache){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pPipelineCache != null ? pPipelineCache.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pPipelineCache);

}

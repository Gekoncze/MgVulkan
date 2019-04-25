package cz.mg.vulkan;

public class PFNvkGetPipelineCacheData extends VkFunctionPointer {
    public PFNvkGetPipelineCacheData() {
    }

    protected PFNvkGetPipelineCacheData(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPipelineCacheData(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPipelineCacheData(long value) {
        setValue(value);
    }

    public PFNvkGetPipelineCacheData(VkInstance instance) {
        super(instance, new VkString("vkGetPipelineCacheData"));
    }

    public void call(VkDevice device, VkPipelineCache pipelineCache, VkSize pDataSize, VkObject pData, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pipelineCache != null ? pipelineCache.getVkAddress() : VkPointer.getNullAddressNative(), pDataSize != null ? pDataSize.getVkAddress() : VkPointer.NULL, pData != null ? pData.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long pipelineCache, long pDataSize, long pData, long rval);
}

package cz.mg.vulkan;

public class PFNvkCreateGraphicsPipelines extends VkFunctionPointer {
    public PFNvkCreateGraphicsPipelines() {
    }

    protected PFNvkCreateGraphicsPipelines(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateGraphicsPipelines(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateGraphicsPipelines(long value) {
        setValue(value);
    }

    public PFNvkCreateGraphicsPipelines(VkInstance instance) {
        super(instance, new VkString("vkCreateGraphicsPipelines"));
    }

    public void call(VkDevice device, VkPipelineCache pipelineCache, VkUInt32 createInfoCount, VkGraphicsPipelineCreateInfo pCreateInfos, VkAllocationCallbacks pAllocator, VkPipeline pPipelines, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pipelineCache != null ? pipelineCache.getVkAddress() : VkPointer.getNullAddressNative(), createInfoCount != null ? createInfoCount.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfos != null ? pCreateInfos.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pPipelines != null ? pPipelines.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pipelineCache, long createInfoCount, long pCreateInfos, long pAllocator, long pPipelines, long rval);


    public int call(VkDevice device, VkPipelineCache pipelineCache, int createInfoCount, VkGraphicsPipelineCreateInfo pCreateInfos, VkAllocationCallbacks pAllocator, VkPipeline pPipelines){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pipelineCache != null ? pipelineCache.getVkAddress() : VkPointer.getNullAddressNative(), createInfoCount, pCreateInfos != null ? pCreateInfos.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pPipelines != null ? pPipelines.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines);

}

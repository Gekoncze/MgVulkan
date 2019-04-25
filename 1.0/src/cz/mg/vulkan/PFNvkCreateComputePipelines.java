package cz.mg.vulkan;

public class PFNvkCreateComputePipelines extends VkFunctionPointer {
    public PFNvkCreateComputePipelines() {
    }

    protected PFNvkCreateComputePipelines(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateComputePipelines(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateComputePipelines(long value) {
        setValue(value);
    }

    public PFNvkCreateComputePipelines(VkInstance instance) {
        super(instance, new VkString("vkCreateComputePipelines"));
    }

    public void call(VkDevice device, VkPipelineCache pipelineCache, VkUInt32 createInfoCount, VkComputePipelineCreateInfo pCreateInfos, VkAllocationCallbacks pAllocator, VkPipeline pPipelines, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pipelineCache != null ? pipelineCache.getVkAddress() : VkPointer.getNullAddressNative(), createInfoCount != null ? createInfoCount.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfos != null ? pCreateInfos.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pPipelines != null ? pPipelines.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long pipelineCache, long createInfoCount, long pCreateInfos, long pAllocator, long pPipelines, long rval);
}

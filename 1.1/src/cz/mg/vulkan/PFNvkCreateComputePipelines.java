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

    public int call(VkDevice device, VkPipelineCache pipelineCache, int createInfoCount, VkComputePipelineCreateInfo pCreateInfos, VkAllocationCallbacks pAllocator, VkPipeline pPipelines){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pipelineCache != null ? pipelineCache.getVkAddress() : VkPointer.getNullAddressNative(), createInfoCount, pCreateInfos != null ? pCreateInfos.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pPipelines != null ? pPipelines.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines);

}

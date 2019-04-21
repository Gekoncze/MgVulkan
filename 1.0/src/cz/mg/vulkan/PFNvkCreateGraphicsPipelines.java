package cz.mg.vulkan;

public class PFNvkCreateGraphicsPipelines extends VkFunctionPointer {
    public PFNvkCreateGraphicsPipelines() {
    }

    public PFNvkCreateGraphicsPipelines(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateGraphicsPipelines(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateGraphicsPipelines(long value) {
        setValue(value);
    }

    public PFNvkCreateGraphicsPipelines(VkInstance instance) {
        super(instance, new VkString("vkCreateGraphicsPipelines"));
    }

    public void call(VkDevice device, VkPipelineCache pipelineCache, VkUInt32 createInfoCount, VkGraphicsPipelineCreateInfo pCreateInfos, VkAllocationCallbacks pAllocator, VkPipeline pPipelines, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pipelineCache != null ? pipelineCache.getVkAddress() : VkPointer.getNullAddress(), createInfoCount != null ? createInfoCount.getVkAddress() : VkPointer.getNullAddress(), pCreateInfos != null ? pCreateInfos.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pPipelines != null ? pPipelines.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long pipelineCache, long createInfoCount, long pCreateInfos, long pAllocator, long pPipelines, long rval);
}

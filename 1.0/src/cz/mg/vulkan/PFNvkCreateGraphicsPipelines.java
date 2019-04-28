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

    public int call(VkDevice device, VkPipelineCache pipelineCache, int createInfoCount, VkGraphicsPipelineCreateInfo pCreateInfos, VkAllocationCallbacks pAllocator, VkPipeline pPipelines){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pipelineCache != null ? pipelineCache.getVkAddress() : VkPointer.getNullAddressNative(), createInfoCount, pCreateInfos != null ? pCreateInfos.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pPipelines != null ? pPipelines.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines);

}

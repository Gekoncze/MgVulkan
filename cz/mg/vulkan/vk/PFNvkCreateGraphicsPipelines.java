package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateGraphicsPipelines.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pipelineCache != null ? pipelineCache.getVkAddress() : VkPipelineCache.NULL.getVkAddress(), createInfoCount != null ? createInfoCount.getVkAddress() : VkPointer.NULL, pCreateInfos != null ? pCreateInfos.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pPipelines != null ? pPipelines.getVkAddress() : VkPipeline.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pipelineCache, long createInfoCount, long pCreateInfos, long pAllocator, long pPipelines, long rval);
}

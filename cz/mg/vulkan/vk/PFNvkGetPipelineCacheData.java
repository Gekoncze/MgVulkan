package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPipelineCacheData.html">khronos documentation</a>
 **/
public class PFNvkGetPipelineCacheData extends VkFunctionPointer {
    public PFNvkGetPipelineCacheData() {
    }

    public PFNvkGetPipelineCacheData(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPipelineCacheData(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPipelineCacheData(long value) {
        setValue(value);
    }

    public PFNvkGetPipelineCacheData(VkInstance instance) {
        super(instance, new VkString("vkGetPipelineCacheData"));
    }

    public void call(VkDevice device, VkPipelineCache pipelineCache, VkSize pDataSize, VkObject pData, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pipelineCache != null ? pipelineCache.getVkAddress() : VkPipelineCache.NULL.getVkAddress(), pDataSize != null ? pDataSize.getVkAddress() : VkPointer.NULL, pData != null ? pData.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pipelineCache, long pDataSize, long pData, long rval);
}

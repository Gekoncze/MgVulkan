package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreatePipelineCache.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pPipelineCache != null ? pPipelineCache.getVkAddress() : VkPipelineCache.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pPipelineCache, long rval);
}

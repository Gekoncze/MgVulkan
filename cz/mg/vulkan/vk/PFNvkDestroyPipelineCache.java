package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyPipelineCache.html">khronos documentation</a>
 **/
public class PFNvkDestroyPipelineCache extends VkFunctionPointer {
    public PFNvkDestroyPipelineCache() {
    }

    public PFNvkDestroyPipelineCache(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyPipelineCache(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyPipelineCache(long value) {
        setValue(value);
    }

    public PFNvkDestroyPipelineCache(VkInstance instance) {
        super(instance, new VkString("vkDestroyPipelineCache"));
    }

    public void call(VkDevice device, VkPipelineCache pipelineCache, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pipelineCache != null ? pipelineCache.getVkAddress() : VkPointer.NULL_ADDRESS, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pipelineCache, long pAllocator);
}

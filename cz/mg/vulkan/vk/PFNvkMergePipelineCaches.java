package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkMergePipelineCaches.html">khronos documentation</a>
 **/
public class PFNvkMergePipelineCaches extends VkFunctionPointer {
    public PFNvkMergePipelineCaches() {
    }

    public PFNvkMergePipelineCaches(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkMergePipelineCaches(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkMergePipelineCaches(long value) {
        setValue(value);
    }

    public PFNvkMergePipelineCaches(VkInstance instance) {
        super(instance, new VkString("vkMergePipelineCaches"));
    }

    public void call(VkDevice device, VkPipelineCache dstCache, VkUInt32 srcCacheCount, VkPipelineCache pSrcCaches, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, dstCache != null ? dstCache.getVkAddress() : VkPointer.NULL_ADDRESS, srcCacheCount != null ? srcCacheCount.getVkAddress() : VkPointer.NULL_ADDRESS, pSrcCaches != null ? pSrcCaches.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long dstCache, long srcCacheCount, long pSrcCaches, long rval);
}

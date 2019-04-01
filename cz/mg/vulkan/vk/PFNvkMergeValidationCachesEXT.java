package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkMergeValidationCachesEXT.html">khronos documentation</a>
 **/
public class PFNvkMergeValidationCachesEXT extends VkFunctionPointer {
    public PFNvkMergeValidationCachesEXT() {
    }

    public PFNvkMergeValidationCachesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkMergeValidationCachesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkMergeValidationCachesEXT(long value) {
        setValue(value);
    }

    public PFNvkMergeValidationCachesEXT(VkInstance instance) {
        super(instance, new VkString("vkMergeValidationCachesEXT"));
    }

    public void call(VkDevice device, VkValidationCacheEXT dstCache, VkUInt32 srcCacheCount, VkValidationCacheEXT pSrcCaches, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, dstCache != null ? dstCache.getVkAddress() : VkPointer.NULL_ADDRESS, srcCacheCount != null ? srcCacheCount.getVkAddress() : VkPointer.NULL_ADDRESS, pSrcCaches != null ? pSrcCaches.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long dstCache, long srcCacheCount, long pSrcCaches, long rval);
}

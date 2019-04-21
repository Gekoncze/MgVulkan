package cz.mg.vulkan;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), dstCache != null ? dstCache.getVkAddress() : VkPointer.getNullAddress(), srcCacheCount != null ? srcCacheCount.getVkAddress() : VkPointer.getNullAddress(), pSrcCaches != null ? pSrcCaches.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long dstCache, long srcCacheCount, long pSrcCaches, long rval);
}

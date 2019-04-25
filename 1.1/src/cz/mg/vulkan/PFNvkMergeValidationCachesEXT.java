package cz.mg.vulkan;

public class PFNvkMergeValidationCachesEXT extends VkFunctionPointer {
    public PFNvkMergeValidationCachesEXT() {
    }

    protected PFNvkMergeValidationCachesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkMergeValidationCachesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkMergeValidationCachesEXT(long value) {
        setValue(value);
    }

    public PFNvkMergeValidationCachesEXT(VkInstance instance) {
        super(instance, new VkString("vkMergeValidationCachesEXT"));
    }

    public void call(VkDevice device, VkValidationCacheEXT dstCache, VkUInt32 srcCacheCount, VkValidationCacheEXT pSrcCaches, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), dstCache != null ? dstCache.getVkAddress() : VkPointer.getNullAddressNative(), srcCacheCount != null ? srcCacheCount.getVkAddress() : VkPointer.getNullAddressNative(), pSrcCaches != null ? pSrcCaches.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long dstCache, long srcCacheCount, long pSrcCaches, long rval);
}

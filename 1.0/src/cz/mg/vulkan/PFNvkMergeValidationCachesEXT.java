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

    public int call(VkDevice device, VkValidationCacheEXT dstCache, int srcCacheCount, VkValidationCacheEXT pSrcCaches){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), dstCache != null ? dstCache.getVkAddress() : VkPointer.getNullAddressNative(), srcCacheCount, pSrcCaches != null ? pSrcCaches.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long dstCache, int srcCacheCount, long pSrcCaches);

}

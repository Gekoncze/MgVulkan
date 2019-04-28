package cz.mg.vulkan;

public class PFNvkMergePipelineCaches extends VkFunctionPointer {
    public PFNvkMergePipelineCaches() {
    }

    protected PFNvkMergePipelineCaches(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkMergePipelineCaches(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkMergePipelineCaches(long value) {
        setValue(value);
    }

    public PFNvkMergePipelineCaches(VkInstance instance) {
        super(instance, new VkString("vkMergePipelineCaches"));
    }

    public void call(VkDevice device, VkPipelineCache dstCache, VkUInt32 srcCacheCount, VkPipelineCache pSrcCaches, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), dstCache != null ? dstCache.getVkAddress() : VkPointer.getNullAddressNative(), srcCacheCount != null ? srcCacheCount.getVkAddress() : VkPointer.getNullAddressNative(), pSrcCaches != null ? pSrcCaches.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long dstCache, long srcCacheCount, long pSrcCaches, long rval);


    public int call(VkDevice device, VkPipelineCache dstCache, int srcCacheCount, VkPipelineCache pSrcCaches){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), dstCache != null ? dstCache.getVkAddress() : VkPointer.getNullAddressNative(), srcCacheCount, pSrcCaches != null ? pSrcCaches.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long dstCache, int srcCacheCount, long pSrcCaches);

}

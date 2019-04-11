package cz.mg.vulkan;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), dstCache != null ? dstCache.getVkAddress() : VkPointer.getNullAddress(), srcCacheCount != null ? srcCacheCount.getVkAddress() : VkPointer.getNullAddress(), pSrcCaches != null ? pSrcCaches.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long device, long dstCache, long srcCacheCount, long pSrcCaches, long rval);
}

package cz.mg.vulkan;

public class PFNvkGetValidationCacheDataEXT extends VkFunctionPointer {
    public PFNvkGetValidationCacheDataEXT() {
    }

    public PFNvkGetValidationCacheDataEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetValidationCacheDataEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetValidationCacheDataEXT(long value) {
        setValue(value);
    }

    public PFNvkGetValidationCacheDataEXT(VkInstance instance) {
        super(instance, new VkString("vkGetValidationCacheDataEXT"));
    }

    public void call(VkDevice device, VkValidationCacheEXT validationCache, VkSize pDataSize, VkObject pData, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), validationCache != null ? validationCache.getVkAddress() : VkPointer.getNullAddressNative(), pDataSize != null ? pDataSize.getVkAddress() : VkPointer.NULL, pData != null ? pData.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long validationCache, long pDataSize, long pData, long rval);
}

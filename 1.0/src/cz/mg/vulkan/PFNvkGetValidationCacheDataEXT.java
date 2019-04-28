package cz.mg.vulkan;

public class PFNvkGetValidationCacheDataEXT extends VkFunctionPointer {
    public PFNvkGetValidationCacheDataEXT() {
    }

    protected PFNvkGetValidationCacheDataEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetValidationCacheDataEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetValidationCacheDataEXT(long value) {
        setValue(value);
    }

    public PFNvkGetValidationCacheDataEXT(VkInstance instance) {
        super(instance, new VkString("vkGetValidationCacheDataEXT"));
    }

    public int call(VkDevice device, VkValidationCacheEXT validationCache, VkSize pDataSize, VkObject pData){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), validationCache != null ? validationCache.getVkAddress() : VkPointer.getNullAddressNative(), pDataSize != null ? pDataSize.getVkAddress() : VkPointer.NULL, pData != null ? pData.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long validationCache, long pDataSize, long pData);

}

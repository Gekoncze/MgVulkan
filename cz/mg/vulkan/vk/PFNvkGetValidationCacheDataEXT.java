package cz.mg.vulkan.vk;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, validationCache != null ? validationCache.getVkAddress() : VkPointer.NULL_ADDRESS, pDataSize != null ? pDataSize.getVkAddress() : VkPointer.NULL, pData != null ? pData.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long validationCache, long pDataSize, long pData, long rval);
}

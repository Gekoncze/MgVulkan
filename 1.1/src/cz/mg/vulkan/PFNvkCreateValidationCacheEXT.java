package cz.mg.vulkan;

public class PFNvkCreateValidationCacheEXT extends VkFunctionPointer {
    public PFNvkCreateValidationCacheEXT() {
    }

    protected PFNvkCreateValidationCacheEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateValidationCacheEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateValidationCacheEXT(long value) {
        setValue(value);
    }

    public PFNvkCreateValidationCacheEXT(VkInstance instance) {
        super(instance, new VkString("vkCreateValidationCacheEXT"));
    }

    public void call(VkDevice device, VkValidationCacheCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkValidationCacheEXT pValidationCache, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pValidationCache != null ? pValidationCache.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pValidationCache, long rval);


    public int call(VkDevice device, VkValidationCacheCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkValidationCacheEXT pValidationCache){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pValidationCache != null ? pValidationCache.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pValidationCache);

}

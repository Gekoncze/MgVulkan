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

    public int call(VkDevice device, VkValidationCacheCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkValidationCacheEXT pValidationCache){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pValidationCache != null ? pValidationCache.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pValidationCache);

}

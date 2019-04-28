package cz.mg.vulkan;

public class PFNvkDestroyValidationCacheEXT extends VkFunctionPointer {
    public PFNvkDestroyValidationCacheEXT() {
    }

    protected PFNvkDestroyValidationCacheEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyValidationCacheEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyValidationCacheEXT(long value) {
        setValue(value);
    }

    public PFNvkDestroyValidationCacheEXT(VkInstance instance) {
        super(instance, new VkString("vkDestroyValidationCacheEXT"));
    }

    public void call(VkDevice device, VkValidationCacheEXT validationCache, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), validationCache != null ? validationCache.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long validationCache, long pAllocator);

}

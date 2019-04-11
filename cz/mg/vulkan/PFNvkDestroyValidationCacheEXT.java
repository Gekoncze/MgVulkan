package cz.mg.vulkan;

public class PFNvkDestroyValidationCacheEXT extends VkFunctionPointer {
    public PFNvkDestroyValidationCacheEXT() {
    }

    public PFNvkDestroyValidationCacheEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyValidationCacheEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyValidationCacheEXT(long value) {
        setValue(value);
    }

    public PFNvkDestroyValidationCacheEXT(VkInstance instance) {
        super(instance, new VkString("vkDestroyValidationCacheEXT"));
    }

    public void call(VkDevice device, VkValidationCacheEXT validationCache, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), validationCache != null ? validationCache.getVkAddress() : VkPointer.getNullAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long validationCache, long pAllocator);
}

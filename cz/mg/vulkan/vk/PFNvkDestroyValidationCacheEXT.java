package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyValidationCacheEXT.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), validationCache != null ? validationCache.getVkAddress() : VkValidationCacheEXT.NULL.getVkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long validationCache, long pAllocator);
}

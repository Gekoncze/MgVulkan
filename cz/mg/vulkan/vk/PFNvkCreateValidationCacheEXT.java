package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateValidationCacheEXT.html">khronos documentation</a>
 **/
public class PFNvkCreateValidationCacheEXT extends VkFunctionPointer {
    public PFNvkCreateValidationCacheEXT() {
    }

    public PFNvkCreateValidationCacheEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateValidationCacheEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateValidationCacheEXT(long value) {
        setValue(value);
    }

    public PFNvkCreateValidationCacheEXT(VkInstance instance) {
        super(instance, new VkString("vkCreateValidationCacheEXT"));
    }

    public void call(VkDevice device, VkValidationCacheCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, VkValidationCacheEXT pValidationCache, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pValidationCache != null ? pValidationCache.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pValidationCache, long rval);
}

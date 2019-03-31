package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroySamplerYcbcrConversionKHR.html">khronos documentation</a>
 **/
public class PFNvkDestroySamplerYcbcrConversionKHR extends VkFunctionPointer {
    public PFNvkDestroySamplerYcbcrConversionKHR() {
    }

    public PFNvkDestroySamplerYcbcrConversionKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroySamplerYcbcrConversionKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroySamplerYcbcrConversionKHR(long value) {
        setValue(value);
    }

    public PFNvkDestroySamplerYcbcrConversionKHR(VkInstance instance) {
        super(instance, new VkString("vkDestroySamplerYcbcrConversionKHR"));
    }

    public void call(VkDevice device, VkSamplerYcbcrConversion ycbcrConversion, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), ycbcrConversion != null ? ycbcrConversion.getVkAddress() : VkSamplerYcbcrConversion.NULL.getVkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long ycbcrConversion, long pAllocator);
}

package cz.mg.vulkan.vk;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, ycbcrConversion != null ? ycbcrConversion.getVkAddress() : VkPointer.NULL_ADDRESS, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long ycbcrConversion, long pAllocator);
}

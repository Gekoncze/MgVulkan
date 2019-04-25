package cz.mg.vulkan;

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

    public void call(VkDevice device, VkSamplerYcbcrConversionKHR ycbcrConversion, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), ycbcrConversion != null ? ycbcrConversion.getVkAddress() : VkPointer.getNullAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long ycbcrConversion, long pAllocator);
}

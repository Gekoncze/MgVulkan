package cz.mg.vulkan;

public class PFNvkDestroySamplerYcbcrConversionKHR extends VkFunctionPointer {
    public PFNvkDestroySamplerYcbcrConversionKHR() {
    }

    protected PFNvkDestroySamplerYcbcrConversionKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroySamplerYcbcrConversionKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroySamplerYcbcrConversionKHR(long value) {
        setValue(value);
    }

    public PFNvkDestroySamplerYcbcrConversionKHR(VkInstance instance) {
        super(instance, new VkString("vkDestroySamplerYcbcrConversionKHR"));
    }

    public void call(VkDevice device, VkSamplerYcbcrConversion ycbcrConversion, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), ycbcrConversion != null ? ycbcrConversion.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long ycbcrConversion, long pAllocator);

}

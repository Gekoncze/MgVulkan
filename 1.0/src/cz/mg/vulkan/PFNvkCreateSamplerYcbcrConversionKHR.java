package cz.mg.vulkan;

public class PFNvkCreateSamplerYcbcrConversionKHR extends VkFunctionPointer {
    public PFNvkCreateSamplerYcbcrConversionKHR() {
    }

    protected PFNvkCreateSamplerYcbcrConversionKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateSamplerYcbcrConversionKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateSamplerYcbcrConversionKHR(long value) {
        setValue(value);
    }

    public PFNvkCreateSamplerYcbcrConversionKHR(VkInstance instance) {
        super(instance, new VkString("vkCreateSamplerYcbcrConversionKHR"));
    }

    public int call(VkDevice device, VkSamplerYcbcrConversionCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSamplerYcbcrConversion pYcbcrConversion){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pYcbcrConversion != null ? pYcbcrConversion.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pYcbcrConversion);

}

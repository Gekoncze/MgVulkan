package cz.mg.vulkan;

public class PFNvkCreateSamplerYcbcrConversion extends VkFunctionPointer {
    public PFNvkCreateSamplerYcbcrConversion() {
    }

    protected PFNvkCreateSamplerYcbcrConversion(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateSamplerYcbcrConversion(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateSamplerYcbcrConversion(long value) {
        setValue(value);
    }

    public PFNvkCreateSamplerYcbcrConversion(VkInstance instance) {
        super(instance, new VkString("vkCreateSamplerYcbcrConversion"));
    }

    public void call(VkDevice device, VkSamplerYcbcrConversionCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSamplerYcbcrConversion pYcbcrConversion, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pYcbcrConversion != null ? pYcbcrConversion.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pYcbcrConversion, long rval);


    public int call(VkDevice device, VkSamplerYcbcrConversionCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSamplerYcbcrConversion pYcbcrConversion){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pYcbcrConversion != null ? pYcbcrConversion.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pYcbcrConversion);

}

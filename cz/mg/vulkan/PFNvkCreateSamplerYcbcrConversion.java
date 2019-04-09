package cz.mg.vulkan;

public class PFNvkCreateSamplerYcbcrConversion extends VkFunctionPointer {
    public PFNvkCreateSamplerYcbcrConversion() {
    }

    public PFNvkCreateSamplerYcbcrConversion(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateSamplerYcbcrConversion(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateSamplerYcbcrConversion(long value) {
        setValue(value);
    }

    public PFNvkCreateSamplerYcbcrConversion(VkInstance instance) {
        super(instance, new VkString("vkCreateSamplerYcbcrConversion"));
    }

    public void call(VkDevice device, VkSamplerYcbcrConversionCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSamplerYcbcrConversion pYcbcrConversion, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pYcbcrConversion != null ? pYcbcrConversion.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pYcbcrConversion, long rval);
}

package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateSamplerYcbcrConversion.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pYcbcrConversion != null ? pYcbcrConversion.getVkAddress() : VkSamplerYcbcrConversion.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pYcbcrConversion, long rval);
}

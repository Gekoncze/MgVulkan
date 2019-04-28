package cz.mg.vulkan;

public class PFNvkCreateSampler extends VkFunctionPointer {
    public PFNvkCreateSampler() {
    }

    protected PFNvkCreateSampler(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateSampler(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateSampler(long value) {
        setValue(value);
    }

    public PFNvkCreateSampler(VkInstance instance) {
        super(instance, new VkString("vkCreateSampler"));
    }

    public int call(VkDevice device, VkSamplerCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSampler pSampler){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSampler != null ? pSampler.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pSampler);

}

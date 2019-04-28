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

    public void call(VkDevice device, VkSamplerCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSampler pSampler, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSampler != null ? pSampler.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pSampler, long rval);


    public int call(VkDevice device, VkSamplerCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSampler pSampler){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSampler != null ? pSampler.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pSampler);

}

package cz.mg.vulkan;

public class PFNvkCreateSampler extends VkFunctionPointer {
    public PFNvkCreateSampler() {
    }

    public PFNvkCreateSampler(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateSampler(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateSampler(long value) {
        setValue(value);
    }

    public PFNvkCreateSampler(VkInstance instance) {
        super(instance, new VkString("vkCreateSampler"));
    }

    public void call(VkDevice device, VkSamplerCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSampler pSampler, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSampler != null ? pSampler.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pSampler, long rval);
}

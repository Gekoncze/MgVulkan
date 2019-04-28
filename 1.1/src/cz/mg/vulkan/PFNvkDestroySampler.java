package cz.mg.vulkan;

public class PFNvkDestroySampler extends VkFunctionPointer {
    public PFNvkDestroySampler() {
    }

    protected PFNvkDestroySampler(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroySampler(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroySampler(long value) {
        setValue(value);
    }

    public PFNvkDestroySampler(VkInstance instance) {
        super(instance, new VkString("vkDestroySampler"));
    }

    public void call(VkDevice device, VkSampler sampler, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), sampler != null ? sampler.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long sampler, long pAllocator);

}

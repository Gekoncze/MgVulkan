package cz.mg.vulkan;

public class PFNvkDestroySampler extends VkFunctionPointer {
    public PFNvkDestroySampler() {
    }

    public PFNvkDestroySampler(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroySampler(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroySampler(long value) {
        setValue(value);
    }

    public PFNvkDestroySampler(VkInstance instance) {
        super(instance, new VkString("vkDestroySampler"));
    }

    public void call(VkDevice device, VkSampler sampler, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), sampler != null ? sampler.getVkAddress() : VkPointer.getNullAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long sampler, long pAllocator);
}

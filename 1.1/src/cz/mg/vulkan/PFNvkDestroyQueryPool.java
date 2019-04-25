package cz.mg.vulkan;

public class PFNvkDestroyQueryPool extends VkFunctionPointer {
    public PFNvkDestroyQueryPool() {
    }

    public PFNvkDestroyQueryPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyQueryPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyQueryPool(long value) {
        setValue(value);
    }

    public PFNvkDestroyQueryPool(VkInstance instance) {
        super(instance, new VkString("vkDestroyQueryPool"));
    }

    public void call(VkDevice device, VkQueryPool queryPool, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long queryPool, long pAllocator);
}

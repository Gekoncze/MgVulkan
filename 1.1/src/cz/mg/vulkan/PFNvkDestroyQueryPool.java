package cz.mg.vulkan;

public class PFNvkDestroyQueryPool extends VkFunctionPointer {
    public PFNvkDestroyQueryPool() {
    }

    protected PFNvkDestroyQueryPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyQueryPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyQueryPool(long value) {
        setValue(value);
    }

    public PFNvkDestroyQueryPool(VkInstance instance) {
        super(instance, new VkString("vkDestroyQueryPool"));
    }

    public void call(VkDevice device, VkQueryPool queryPool, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long queryPool, long pAllocator);

}

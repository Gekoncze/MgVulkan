package cz.mg.vulkan;

public class PFNvkDestroyCommandPool extends VkFunctionPointer {
    public PFNvkDestroyCommandPool() {
    }

    protected PFNvkDestroyCommandPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyCommandPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyCommandPool(long value) {
        setValue(value);
    }

    public PFNvkDestroyCommandPool(VkInstance instance) {
        super(instance, new VkString("vkDestroyCommandPool"));
    }

    public void call(VkDevice device, VkCommandPool commandPool, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), commandPool != null ? commandPool.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long commandPool, long pAllocator);

}

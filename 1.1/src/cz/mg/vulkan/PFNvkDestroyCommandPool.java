package cz.mg.vulkan;

public class PFNvkDestroyCommandPool extends VkFunctionPointer {
    public PFNvkDestroyCommandPool() {
    }

    public PFNvkDestroyCommandPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyCommandPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyCommandPool(long value) {
        setValue(value);
    }

    public PFNvkDestroyCommandPool(VkInstance instance) {
        super(instance, new VkString("vkDestroyCommandPool"));
    }

    public void call(VkDevice device, VkCommandPool commandPool, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), commandPool != null ? commandPool.getVkAddress() : VkPointer.getNullAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long commandPool, long pAllocator);
}

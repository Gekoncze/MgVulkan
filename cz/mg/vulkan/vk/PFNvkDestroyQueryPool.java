package cz.mg.vulkan.vk;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, queryPool != null ? queryPool.getVkAddress() : VkPointer.NULL_ADDRESS, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long queryPool, long pAllocator);
}

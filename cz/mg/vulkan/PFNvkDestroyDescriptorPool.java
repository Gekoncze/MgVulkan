package cz.mg.vulkan;

public class PFNvkDestroyDescriptorPool extends VkFunctionPointer {
    public PFNvkDestroyDescriptorPool() {
    }

    public PFNvkDestroyDescriptorPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyDescriptorPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyDescriptorPool(long value) {
        setValue(value);
    }

    public PFNvkDestroyDescriptorPool(VkInstance instance) {
        super(instance, new VkString("vkDestroyDescriptorPool"));
    }

    public void call(VkDevice device, VkDescriptorPool descriptorPool, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), descriptorPool != null ? descriptorPool.getVkAddress() : VkPointer.getSinkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long descriptorPool, long pAllocator);
}

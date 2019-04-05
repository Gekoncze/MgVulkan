package cz.mg.vulkan.vk;

public class PFNvkDestroyBuffer extends VkFunctionPointer {
    public PFNvkDestroyBuffer() {
    }

    public PFNvkDestroyBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyBuffer(long value) {
        setValue(value);
    }

    public PFNvkDestroyBuffer(VkInstance instance) {
        super(instance, new VkString("vkDestroyBuffer"));
    }

    public void call(VkDevice device, VkBuffer buffer, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, buffer != null ? buffer.getVkAddress() : VkPointer.NULL_ADDRESS, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long buffer, long pAllocator);
}

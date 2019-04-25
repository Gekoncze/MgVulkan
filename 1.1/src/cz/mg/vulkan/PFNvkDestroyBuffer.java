package cz.mg.vulkan;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long buffer, long pAllocator);
}

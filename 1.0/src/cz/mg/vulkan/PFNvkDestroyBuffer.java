package cz.mg.vulkan;

public class PFNvkDestroyBuffer extends VkFunctionPointer {
    public PFNvkDestroyBuffer() {
    }

    protected PFNvkDestroyBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyBuffer(long value) {
        setValue(value);
    }

    public PFNvkDestroyBuffer(VkInstance instance) {
        super(instance, new VkString("vkDestroyBuffer"));
    }

    public void call(VkDevice device, VkBuffer buffer, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long buffer, long pAllocator);
}

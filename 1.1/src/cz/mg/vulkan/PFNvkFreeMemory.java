package cz.mg.vulkan;

public class PFNvkFreeMemory extends VkFunctionPointer {
    public PFNvkFreeMemory() {
    }

    public PFNvkFreeMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkFreeMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkFreeMemory(long value) {
        setValue(value);
    }

    public PFNvkFreeMemory(VkInstance instance) {
        super(instance, new VkString("vkFreeMemory"));
    }

    public void call(VkDevice device, VkDeviceMemory memory, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long memory, long pAllocator);
}

package cz.mg.vulkan;

public class PFNvkAllocateMemory extends VkFunctionPointer {
    public PFNvkAllocateMemory() {
    }

    protected PFNvkAllocateMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkAllocateMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkAllocateMemory(long value) {
        setValue(value);
    }

    public PFNvkAllocateMemory(VkInstance instance) {
        super(instance, new VkString("vkAllocateMemory"));
    }

    public int call(VkDevice device, VkMemoryAllocateInfo pAllocateInfo, VkAllocationCallbacks pAllocator, VkDeviceMemory pMemory){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pAllocateInfo != null ? pAllocateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pMemory != null ? pMemory.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pAllocateInfo, long pAllocator, long pMemory);

}

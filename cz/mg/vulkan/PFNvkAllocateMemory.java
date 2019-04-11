package cz.mg.vulkan;

public class PFNvkAllocateMemory extends VkFunctionPointer {
    public PFNvkAllocateMemory() {
    }

    public PFNvkAllocateMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkAllocateMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkAllocateMemory(long value) {
        setValue(value);
    }

    public PFNvkAllocateMemory(VkInstance instance) {
        super(instance, new VkString("vkAllocateMemory"));
    }

    public void call(VkDevice device, VkMemoryAllocateInfo pAllocateInfo, VkAllocationCallbacks pAllocator, VkDeviceMemory pMemory, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pAllocateInfo != null ? pAllocateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pMemory != null ? pMemory.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long device, long pAllocateInfo, long pAllocator, long pMemory, long rval);
}

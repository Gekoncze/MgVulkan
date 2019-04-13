package cz.mg.vulkan;

public class PFNvkDestroySemaphore extends VkFunctionPointer {
    public PFNvkDestroySemaphore() {
    }

    public PFNvkDestroySemaphore(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroySemaphore(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroySemaphore(long value) {
        setValue(value);
    }

    public PFNvkDestroySemaphore(VkInstance instance) {
        super(instance, new VkString("vkDestroySemaphore"));
    }

    public void call(VkDevice device, VkSemaphore semaphore, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), semaphore != null ? semaphore.getVkAddress() : VkPointer.getSinkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long semaphore, long pAllocator);
}

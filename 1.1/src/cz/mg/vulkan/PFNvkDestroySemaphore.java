package cz.mg.vulkan;

public class PFNvkDestroySemaphore extends VkFunctionPointer {
    public PFNvkDestroySemaphore() {
    }

    protected PFNvkDestroySemaphore(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroySemaphore(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroySemaphore(long value) {
        setValue(value);
    }

    public PFNvkDestroySemaphore(VkInstance instance) {
        super(instance, new VkString("vkDestroySemaphore"));
    }

    public void call(VkDevice device, VkSemaphore semaphore, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), semaphore != null ? semaphore.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long semaphore, long pAllocator);



}

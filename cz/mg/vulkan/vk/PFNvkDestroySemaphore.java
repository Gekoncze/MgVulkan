package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroySemaphore.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), semaphore != null ? semaphore.getVkAddress() : VkSemaphore.NULL.getVkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long semaphore, long pAllocator);
}

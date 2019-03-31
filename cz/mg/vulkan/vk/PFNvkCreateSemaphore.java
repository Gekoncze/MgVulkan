package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateSemaphore.html">khronos documentation</a>
 **/
public class PFNvkCreateSemaphore extends VkFunctionPointer {
    public PFNvkCreateSemaphore() {
    }

    public PFNvkCreateSemaphore(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateSemaphore(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateSemaphore(long value) {
        setValue(value);
    }

    public PFNvkCreateSemaphore(VkInstance instance) {
        super(instance, new VkString("vkCreateSemaphore"));
    }

    public void call(VkDevice device, VkSemaphoreCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSemaphore pSemaphore, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSemaphore != null ? pSemaphore.getVkAddress() : VkSemaphore.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pSemaphore, long rval);
}

package cz.mg.vulkan;

public class PFNvkCreateSemaphore extends VkFunctionPointer {
    public PFNvkCreateSemaphore() {
    }

    protected PFNvkCreateSemaphore(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateSemaphore(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateSemaphore(long value) {
        setValue(value);
    }

    public PFNvkCreateSemaphore(VkInstance instance) {
        super(instance, new VkString("vkCreateSemaphore"));
    }

    public void call(VkDevice device, VkSemaphoreCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSemaphore pSemaphore, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSemaphore != null ? pSemaphore.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pSemaphore, long rval);


    public int call(VkDevice device, VkSemaphoreCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkSemaphore pSemaphore){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSemaphore != null ? pSemaphore.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pSemaphore);

}

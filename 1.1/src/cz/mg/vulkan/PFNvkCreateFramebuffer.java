package cz.mg.vulkan;

public class PFNvkCreateFramebuffer extends VkFunctionPointer {
    public PFNvkCreateFramebuffer() {
    }

    protected PFNvkCreateFramebuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateFramebuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateFramebuffer(long value) {
        setValue(value);
    }

    public PFNvkCreateFramebuffer(VkInstance instance) {
        super(instance, new VkString("vkCreateFramebuffer"));
    }

    public void call(VkDevice device, VkFramebufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkFramebuffer pFramebuffer, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pFramebuffer != null ? pFramebuffer.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pFramebuffer, long rval);


    public int call(VkDevice device, VkFramebufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkFramebuffer pFramebuffer){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pFramebuffer != null ? pFramebuffer.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pFramebuffer);

}

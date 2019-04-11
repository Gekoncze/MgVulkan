package cz.mg.vulkan;

public class PFNvkCreateFramebuffer extends VkFunctionPointer {
    public PFNvkCreateFramebuffer() {
    }

    public PFNvkCreateFramebuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateFramebuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateFramebuffer(long value) {
        setValue(value);
    }

    public PFNvkCreateFramebuffer(VkInstance instance) {
        super(instance, new VkString("vkCreateFramebuffer"));
    }

    public void call(VkDevice device, VkFramebufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkFramebuffer pFramebuffer, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pFramebuffer != null ? pFramebuffer.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pFramebuffer, long rval);
}

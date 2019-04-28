package cz.mg.vulkan;

public class PFNvkDestroyFramebuffer extends VkFunctionPointer {
    public PFNvkDestroyFramebuffer() {
    }

    protected PFNvkDestroyFramebuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyFramebuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyFramebuffer(long value) {
        setValue(value);
    }

    public PFNvkDestroyFramebuffer(VkInstance instance) {
        super(instance, new VkString("vkDestroyFramebuffer"));
    }

    public void call(VkDevice device, VkFramebuffer framebuffer, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), framebuffer != null ? framebuffer.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long framebuffer, long pAllocator);



}

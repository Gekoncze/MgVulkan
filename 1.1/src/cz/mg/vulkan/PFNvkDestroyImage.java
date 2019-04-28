package cz.mg.vulkan;

public class PFNvkDestroyImage extends VkFunctionPointer {
    public PFNvkDestroyImage() {
    }

    protected PFNvkDestroyImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyImage(long value) {
        setValue(value);
    }

    public PFNvkDestroyImage(VkInstance instance) {
        super(instance, new VkString("vkDestroyImage"));
    }

    public void call(VkDevice device, VkImage image, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long image, long pAllocator);



}

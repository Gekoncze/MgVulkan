package cz.mg.vulkan;

public class PFNvkDestroyImageView extends VkFunctionPointer {
    public PFNvkDestroyImageView() {
    }

    public PFNvkDestroyImageView(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyImageView(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyImageView(long value) {
        setValue(value);
    }

    public PFNvkDestroyImageView(VkInstance instance) {
        super(instance, new VkString("vkDestroyImageView"));
    }

    public void call(VkDevice device, VkImageView imageView, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), imageView != null ? imageView.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long imageView, long pAllocator);
}

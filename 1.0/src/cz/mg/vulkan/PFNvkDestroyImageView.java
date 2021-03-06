package cz.mg.vulkan;

public class PFNvkDestroyImageView extends VkFunctionPointer {
    public PFNvkDestroyImageView() {
    }

    protected PFNvkDestroyImageView(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyImageView(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyImageView(long value) {
        setValue(value);
    }

    public PFNvkDestroyImageView(VkInstance instance) {
        super(instance, new VkString("vkDestroyImageView"));
    }

    public void call(VkDevice device, VkImageView imageView, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), imageView != null ? imageView.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long imageView, long pAllocator);

}

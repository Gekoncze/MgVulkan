package cz.mg.vulkan;

public class PFNvkCreateImageView extends VkFunctionPointer {
    public PFNvkCreateImageView() {
    }

    protected PFNvkCreateImageView(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateImageView(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateImageView(long value) {
        setValue(value);
    }

    public PFNvkCreateImageView(VkInstance instance) {
        super(instance, new VkString("vkCreateImageView"));
    }

    public void call(VkDevice device, VkImageViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkImageView pView, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pView != null ? pView.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pView, long rval);


    public int call(VkDevice device, VkImageViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkImageView pView){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pView != null ? pView.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pView);

}

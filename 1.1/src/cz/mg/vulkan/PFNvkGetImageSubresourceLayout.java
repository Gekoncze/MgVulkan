package cz.mg.vulkan;

public class PFNvkGetImageSubresourceLayout extends VkFunctionPointer {
    public PFNvkGetImageSubresourceLayout() {
    }

    protected PFNvkGetImageSubresourceLayout(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetImageSubresourceLayout(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetImageSubresourceLayout(long value) {
        setValue(value);
    }

    public PFNvkGetImageSubresourceLayout(VkInstance instance) {
        super(instance, new VkString("vkGetImageSubresourceLayout"));
    }

    public void call(VkDevice device, VkImage image, VkImageSubresource pSubresource, VkSubresourceLayout pLayout){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative(), pSubresource != null ? pSubresource.getVkAddress() : VkPointer.NULL, pLayout != null ? pLayout.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long image, long pSubresource, long pLayout);

}

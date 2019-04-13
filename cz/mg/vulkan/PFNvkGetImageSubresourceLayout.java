package cz.mg.vulkan;

public class PFNvkGetImageSubresourceLayout extends VkFunctionPointer {
    public PFNvkGetImageSubresourceLayout() {
    }

    public PFNvkGetImageSubresourceLayout(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetImageSubresourceLayout(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetImageSubresourceLayout(long value) {
        setValue(value);
    }

    public PFNvkGetImageSubresourceLayout(VkInstance instance) {
        super(instance, new VkString("vkGetImageSubresourceLayout"));
    }

    public void call(VkDevice device, VkImage image, VkImageSubresource pSubresource, VkSubresourceLayout pLayout){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), image != null ? image.getVkAddress() : VkPointer.getSinkAddress(), pSubresource != null ? pSubresource.getVkAddress() : VkPointer.NULL, pLayout != null ? pLayout.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long image, long pSubresource, long pLayout);
}

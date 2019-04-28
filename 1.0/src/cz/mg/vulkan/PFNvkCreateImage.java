package cz.mg.vulkan;

public class PFNvkCreateImage extends VkFunctionPointer {
    public PFNvkCreateImage() {
    }

    protected PFNvkCreateImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateImage(long value) {
        setValue(value);
    }

    public PFNvkCreateImage(VkInstance instance) {
        super(instance, new VkString("vkCreateImage"));
    }

    public int call(VkDevice device, VkImageCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkImage pImage){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pImage != null ? pImage.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pImage);

}

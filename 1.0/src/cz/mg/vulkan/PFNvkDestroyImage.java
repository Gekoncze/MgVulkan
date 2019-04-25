package cz.mg.vulkan;

public class PFNvkDestroyImage extends VkFunctionPointer {
    public PFNvkDestroyImage() {
    }

    public PFNvkDestroyImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyImage(long value) {
        setValue(value);
    }

    public PFNvkDestroyImage(VkInstance instance) {
        super(instance, new VkString("vkDestroyImage"));
    }

    public void call(VkDevice device, VkImage image, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), image != null ? image.getVkAddress() : VkPointer.getNullAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long image, long pAllocator);
}

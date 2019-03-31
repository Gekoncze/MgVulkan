package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyImage.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), image != null ? image.getVkAddress() : VkImage.NULL.getVkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long image, long pAllocator);
}

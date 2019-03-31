package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyImageView.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), imageView != null ? imageView.getVkAddress() : VkImageView.NULL.getVkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long imageView, long pAllocator);
}

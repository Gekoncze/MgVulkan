package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateImageView.html">khronos documentation</a>
 **/
public class PFNvkCreateImageView extends VkFunctionPointer {
    public PFNvkCreateImageView() {
    }

    public PFNvkCreateImageView(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateImageView(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateImageView(long value) {
        setValue(value);
    }

    public PFNvkCreateImageView(VkInstance instance) {
        super(instance, new VkString("vkCreateImageView"));
    }

    public void call(VkDevice device, VkImageViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkImageView pView, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pView != null ? pView.getVkAddress() : VkImageView.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pView, long rval);
}

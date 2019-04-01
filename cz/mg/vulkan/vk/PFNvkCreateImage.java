package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateImage.html">khronos documentation</a>
 **/
public class PFNvkCreateImage extends VkFunctionPointer {
    public PFNvkCreateImage() {
    }

    public PFNvkCreateImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateImage(long value) {
        setValue(value);
    }

    public PFNvkCreateImage(VkInstance instance) {
        super(instance, new VkString("vkCreateImage"));
    }

    public void call(VkDevice device, VkImageCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkImage pImage, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pImage != null ? pImage.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pImage, long rval);
}

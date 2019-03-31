package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyFramebuffer.html">khronos documentation</a>
 **/
public class PFNvkDestroyFramebuffer extends VkFunctionPointer {
    public PFNvkDestroyFramebuffer() {
    }

    public PFNvkDestroyFramebuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyFramebuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyFramebuffer(long value) {
        setValue(value);
    }

    public PFNvkDestroyFramebuffer(VkInstance instance) {
        super(instance, new VkString("vkDestroyFramebuffer"));
    }

    public void call(VkDevice device, VkFramebuffer framebuffer, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), framebuffer != null ? framebuffer.getVkAddress() : VkFramebuffer.NULL.getVkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long framebuffer, long pAllocator);
}

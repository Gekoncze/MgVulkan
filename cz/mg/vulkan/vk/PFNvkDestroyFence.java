package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyFence.html">khronos documentation</a>
 **/
public class PFNvkDestroyFence extends VkFunctionPointer {
    public PFNvkDestroyFence() {
    }

    public PFNvkDestroyFence(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyFence(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyFence(long value) {
        setValue(value);
    }

    public PFNvkDestroyFence(VkInstance instance) {
        super(instance, new VkString("vkDestroyFence"));
    }

    public void call(VkDevice device, VkFence fence, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), fence != null ? fence.getVkAddress() : VkFence.NULL.getVkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long fence, long pAllocator);
}

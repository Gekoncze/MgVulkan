package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyCommandPool.html">khronos documentation</a>
 **/
public class PFNvkDestroyCommandPool extends VkFunctionPointer {
    public PFNvkDestroyCommandPool() {
    }

    public PFNvkDestroyCommandPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyCommandPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyCommandPool(long value) {
        setValue(value);
    }

    public PFNvkDestroyCommandPool(VkInstance instance) {
        super(instance, new VkString("vkDestroyCommandPool"));
    }

    public void call(VkDevice device, VkCommandPool commandPool, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), commandPool != null ? commandPool.getVkAddress() : VkCommandPool.NULL.getVkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long commandPool, long pAllocator);
}

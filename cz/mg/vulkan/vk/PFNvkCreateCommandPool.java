package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateCommandPool.html">khronos documentation</a>
 **/
public class PFNvkCreateCommandPool extends VkFunctionPointer {
    public PFNvkCreateCommandPool() {
    }

    public PFNvkCreateCommandPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateCommandPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateCommandPool(long value) {
        setValue(value);
    }

    public PFNvkCreateCommandPool(VkInstance instance) {
        super(instance, new VkString("vkCreateCommandPool"));
    }

    public void call(VkDevice device, VkCommandPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkCommandPool pCommandPool, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pCommandPool != null ? pCommandPool.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pCommandPool, long rval);
}

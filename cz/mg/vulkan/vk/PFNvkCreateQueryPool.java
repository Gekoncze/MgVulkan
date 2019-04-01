package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateQueryPool.html">khronos documentation</a>
 **/
public class PFNvkCreateQueryPool extends VkFunctionPointer {
    public PFNvkCreateQueryPool() {
    }

    public PFNvkCreateQueryPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateQueryPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateQueryPool(long value) {
        setValue(value);
    }

    public PFNvkCreateQueryPool(VkInstance instance) {
        super(instance, new VkString("vkCreateQueryPool"));
    }

    public void call(VkDevice device, VkQueryPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkQueryPool pQueryPool, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pQueryPool != null ? pQueryPool.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pQueryPool, long rval);
}

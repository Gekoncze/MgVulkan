package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateFence.html">khronos documentation</a>
 **/
public class PFNvkCreateFence extends VkFunctionPointer {
    public PFNvkCreateFence() {
    }

    public PFNvkCreateFence(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateFence(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateFence(long value) {
        setValue(value);
    }

    public PFNvkCreateFence(VkInstance instance) {
        super(instance, new VkString("vkCreateFence"));
    }

    public void call(VkDevice device, VkFenceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkFence pFence, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pFence != null ? pFence.getVkAddress() : VkFence.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pFence, long rval);
}

package cz.mg.vulkan;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pFence != null ? pFence.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pFence, long rval);
}

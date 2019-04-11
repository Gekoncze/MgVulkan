package cz.mg.vulkan;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pCommandPool != null ? pCommandPool.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pCommandPool, long rval);
}

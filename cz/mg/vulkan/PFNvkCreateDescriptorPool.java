package cz.mg.vulkan;

public class PFNvkCreateDescriptorPool extends VkFunctionPointer {
    public PFNvkCreateDescriptorPool() {
    }

    public PFNvkCreateDescriptorPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateDescriptorPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateDescriptorPool(long value) {
        setValue(value);
    }

    public PFNvkCreateDescriptorPool(VkInstance instance) {
        super(instance, new VkString("vkCreateDescriptorPool"));
    }

    public void call(VkDevice device, VkDescriptorPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorPool pDescriptorPool, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pDescriptorPool != null ? pDescriptorPool.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pDescriptorPool, long rval);
}

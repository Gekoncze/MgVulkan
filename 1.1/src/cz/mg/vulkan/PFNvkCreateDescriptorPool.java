package cz.mg.vulkan;

public class PFNvkCreateDescriptorPool extends VkFunctionPointer {
    public PFNvkCreateDescriptorPool() {
    }

    protected PFNvkCreateDescriptorPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateDescriptorPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateDescriptorPool(long value) {
        setValue(value);
    }

    public PFNvkCreateDescriptorPool(VkInstance instance) {
        super(instance, new VkString("vkCreateDescriptorPool"));
    }

    public int call(VkDevice device, VkDescriptorPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorPool pDescriptorPool){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pDescriptorPool != null ? pDescriptorPool.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pDescriptorPool);

}

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

    public void call(VkDevice device, VkDescriptorPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorPool pDescriptorPool, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pDescriptorPool != null ? pDescriptorPool.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pDescriptorPool, long rval);


    public int call(VkDevice device, VkDescriptorPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDescriptorPool pDescriptorPool){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pDescriptorPool != null ? pDescriptorPool.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pDescriptorPool);

}

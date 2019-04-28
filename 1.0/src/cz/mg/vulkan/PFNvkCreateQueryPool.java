package cz.mg.vulkan;

public class PFNvkCreateQueryPool extends VkFunctionPointer {
    public PFNvkCreateQueryPool() {
    }

    protected PFNvkCreateQueryPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateQueryPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateQueryPool(long value) {
        setValue(value);
    }

    public PFNvkCreateQueryPool(VkInstance instance) {
        super(instance, new VkString("vkCreateQueryPool"));
    }

    public void call(VkDevice device, VkQueryPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkQueryPool pQueryPool, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pQueryPool != null ? pQueryPool.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pQueryPool, long rval);


    public int call(VkDevice device, VkQueryPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkQueryPool pQueryPool){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pQueryPool != null ? pQueryPool.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pQueryPool);

}

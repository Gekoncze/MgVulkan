package cz.mg.vulkan;

public class PFNvkCreateCommandPool extends VkFunctionPointer {
    public PFNvkCreateCommandPool() {
    }

    protected PFNvkCreateCommandPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateCommandPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateCommandPool(long value) {
        setValue(value);
    }

    public PFNvkCreateCommandPool(VkInstance instance) {
        super(instance, new VkString("vkCreateCommandPool"));
    }

    public void call(VkDevice device, VkCommandPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkCommandPool pCommandPool, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pCommandPool != null ? pCommandPool.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pCommandPool, long rval);


    public int call(VkDevice device, VkCommandPoolCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkCommandPool pCommandPool){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pCommandPool != null ? pCommandPool.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pCommandPool);

}

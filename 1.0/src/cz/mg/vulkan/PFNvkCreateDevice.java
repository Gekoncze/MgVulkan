package cz.mg.vulkan;

public class PFNvkCreateDevice extends VkFunctionPointer {
    public PFNvkCreateDevice() {
    }

    protected PFNvkCreateDevice(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateDevice(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateDevice(long value) {
        setValue(value);
    }

    public PFNvkCreateDevice(VkInstance instance) {
        super(instance, new VkString("vkCreateDevice"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkDeviceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDevice pDevice, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pDevice != null ? pDevice.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long physicalDevice, long pCreateInfo, long pAllocator, long pDevice, long rval);
}

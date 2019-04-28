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

    public int call(VkPhysicalDevice physicalDevice, VkDeviceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkDevice pDevice){
        return callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pDevice != null ? pDevice.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long physicalDevice, long pCreateInfo, long pAllocator, long pDevice);

}

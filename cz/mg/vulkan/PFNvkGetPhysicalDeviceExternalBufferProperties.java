package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceExternalBufferProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalBufferProperties() {
    }

    public PFNvkGetPhysicalDeviceExternalBufferProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceExternalBufferProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceExternalBufferProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalBufferProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalBufferProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalBufferInfo pExternalBufferInfo, VkExternalBufferProperties pExternalBufferProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddress(), pExternalBufferInfo != null ? pExternalBufferInfo.getVkAddress() : VkPointer.NULL, pExternalBufferProperties != null ? pExternalBufferProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pExternalBufferInfo, long pExternalBufferProperties);
}

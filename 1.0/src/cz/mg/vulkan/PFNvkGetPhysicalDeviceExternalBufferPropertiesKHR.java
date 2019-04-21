package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR() {
    }

    public PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalBufferPropertiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalBufferInfoKHR pExternalBufferInfo, VkExternalBufferPropertiesKHR pExternalBufferProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddress(), pExternalBufferInfo != null ? pExternalBufferInfo.getVkAddress() : VkPointer.NULL, pExternalBufferProperties != null ? pExternalBufferProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pExternalBufferInfo, long pExternalBufferProperties);
}

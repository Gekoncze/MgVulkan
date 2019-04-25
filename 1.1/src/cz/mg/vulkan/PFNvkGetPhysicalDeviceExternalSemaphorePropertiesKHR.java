package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR() {
    }

    public PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalSemaphorePropertiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo, VkExternalSemaphoreProperties pExternalSemaphoreProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pExternalSemaphoreInfo != null ? pExternalSemaphoreInfo.getVkAddress() : VkPointer.NULL, pExternalSemaphoreProperties != null ? pExternalSemaphoreProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long physicalDevice, long pExternalSemaphoreInfo, long pExternalSemaphoreProperties);
}

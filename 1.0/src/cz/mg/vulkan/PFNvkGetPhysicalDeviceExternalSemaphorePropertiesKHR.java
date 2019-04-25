package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR() {
    }

    protected PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalSemaphorePropertiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalSemaphoreInfoKHR pExternalSemaphoreInfo, VkExternalSemaphorePropertiesKHR pExternalSemaphoreProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pExternalSemaphoreInfo != null ? pExternalSemaphoreInfo.getVkAddress() : VkPointer.NULL, pExternalSemaphoreProperties != null ? pExternalSemaphoreProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long physicalDevice, long pExternalSemaphoreInfo, long pExternalSemaphoreProperties);
}

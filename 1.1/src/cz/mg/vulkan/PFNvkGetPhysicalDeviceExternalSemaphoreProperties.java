package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceExternalSemaphoreProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalSemaphoreProperties() {
    }

    protected PFNvkGetPhysicalDeviceExternalSemaphoreProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceExternalSemaphoreProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceExternalSemaphoreProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalSemaphoreProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalSemaphoreProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo, VkExternalSemaphoreProperties pExternalSemaphoreProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pExternalSemaphoreInfo != null ? pExternalSemaphoreInfo.getVkAddress() : VkPointer.NULL, pExternalSemaphoreProperties != null ? pExternalSemaphoreProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long physicalDevice, long pExternalSemaphoreInfo, long pExternalSemaphoreProperties);
}

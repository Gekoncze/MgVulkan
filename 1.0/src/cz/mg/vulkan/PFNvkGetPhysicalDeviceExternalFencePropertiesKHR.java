package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceExternalFencePropertiesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalFencePropertiesKHR() {
    }

    protected PFNvkGetPhysicalDeviceExternalFencePropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceExternalFencePropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceExternalFencePropertiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalFencePropertiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalFencePropertiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalFenceInfoKHR pExternalFenceInfo, VkExternalFencePropertiesKHR pExternalFenceProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pExternalFenceInfo != null ? pExternalFenceInfo.getVkAddress() : VkPointer.NULL, pExternalFenceProperties != null ? pExternalFenceProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long physicalDevice, long pExternalFenceInfo, long pExternalFenceProperties);
}

package cz.mg.vulkan.vk;

public class PFNvkGetPhysicalDeviceExternalFencePropertiesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalFencePropertiesKHR() {
    }

    public PFNvkGetPhysicalDeviceExternalFencePropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceExternalFencePropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceExternalFencePropertiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalFencePropertiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalFencePropertiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo, VkExternalFenceProperties pExternalFenceProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, pExternalFenceInfo != null ? pExternalFenceInfo.getVkAddress() : VkPointer.NULL, pExternalFenceProperties != null ? pExternalFenceProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pExternalFenceInfo, long pExternalFenceProperties);
}

package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceDisplayPropertiesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceDisplayPropertiesKHR() {
    }

    protected PFNvkGetPhysicalDeviceDisplayPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceDisplayPropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceDisplayPropertiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceDisplayPropertiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceDisplayPropertiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkDisplayPropertiesKHR pProperties, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long physicalDevice, long pPropertyCount, long pProperties, long rval);
}

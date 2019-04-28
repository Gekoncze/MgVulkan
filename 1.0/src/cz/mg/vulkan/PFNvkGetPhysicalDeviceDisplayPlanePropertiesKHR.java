package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR() {
    }

    protected PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceDisplayPlanePropertiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkDisplayPlanePropertiesKHR pProperties, VkResult rval){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pPropertyCount, long pProperties, long rval);


    public int call(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkDisplayPlanePropertiesKHR pProperties){
        return callSimplifiedNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long physicalDevice, long pPropertyCount, long pProperties);

}

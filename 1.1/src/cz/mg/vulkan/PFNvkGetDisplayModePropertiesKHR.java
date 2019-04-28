package cz.mg.vulkan;

public class PFNvkGetDisplayModePropertiesKHR extends VkFunctionPointer {
    public PFNvkGetDisplayModePropertiesKHR() {
    }

    protected PFNvkGetDisplayModePropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetDisplayModePropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDisplayModePropertiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetDisplayModePropertiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetDisplayModePropertiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkUInt32 pPropertyCount, VkDisplayModePropertiesKHR pProperties, VkResult rval){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), display != null ? display.getVkAddress() : VkPointer.getNullAddressNative(), pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long display, long pPropertyCount, long pProperties, long rval);


    public int call(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkUInt32 pPropertyCount, VkDisplayModePropertiesKHR pProperties){
        return callSimplifiedNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), display != null ? display.getVkAddress() : VkPointer.getNullAddressNative(), pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long physicalDevice, long display, long pPropertyCount, long pProperties);

}

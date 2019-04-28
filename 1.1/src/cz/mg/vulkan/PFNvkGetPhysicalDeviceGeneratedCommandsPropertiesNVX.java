package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX() {
    }

    protected PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkDeviceGeneratedCommandsFeaturesNVX pFeatures, VkDeviceGeneratedCommandsLimitsNVX pLimits){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pFeatures != null ? pFeatures.getVkAddress() : VkPointer.NULL, pLimits != null ? pLimits.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pFeatures, long pLimits);



}

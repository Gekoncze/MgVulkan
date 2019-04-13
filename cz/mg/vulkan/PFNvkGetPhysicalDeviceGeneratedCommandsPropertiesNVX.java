package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX() {
    }

    public PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkDeviceGeneratedCommandsFeaturesNVX pFeatures, VkDeviceGeneratedCommandsLimitsNVX pLimits){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getSinkAddress(), pFeatures != null ? pFeatures.getVkAddress() : VkPointer.NULL, pLimits != null ? pLimits.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pFeatures, long pLimits);
}

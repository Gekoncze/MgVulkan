package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceImageFormatProperties2KHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceImageFormatProperties2KHR() {
    }

    protected PFNvkGetPhysicalDeviceImageFormatProperties2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceImageFormatProperties2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceImageFormatProperties2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceImageFormatProperties2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceImageFormatProperties2KHR"));
    }

    public int call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VkImageFormatProperties2 pImageFormatProperties){
        return callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pImageFormatInfo != null ? pImageFormatInfo.getVkAddress() : VkPointer.NULL, pImageFormatProperties != null ? pImageFormatProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long physicalDevice, long pImageFormatInfo, long pImageFormatProperties);

}

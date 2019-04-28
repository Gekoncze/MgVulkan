package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceImageFormatProperties2 extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceImageFormatProperties2() {
    }

    protected PFNvkGetPhysicalDeviceImageFormatProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceImageFormatProperties2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceImageFormatProperties2(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceImageFormatProperties2(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceImageFormatProperties2"));
    }

    public int call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VkImageFormatProperties2 pImageFormatProperties){
        return callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pImageFormatInfo != null ? pImageFormatInfo.getVkAddress() : VkPointer.NULL, pImageFormatProperties != null ? pImageFormatProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long physicalDevice, long pImageFormatInfo, long pImageFormatProperties);

}

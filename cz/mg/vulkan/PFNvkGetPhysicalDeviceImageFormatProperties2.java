package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceImageFormatProperties2 extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceImageFormatProperties2() {
    }

    public PFNvkGetPhysicalDeviceImageFormatProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceImageFormatProperties2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceImageFormatProperties2(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceImageFormatProperties2(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceImageFormatProperties2"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VkImageFormatProperties2 pImageFormatProperties, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getSinkAddress(), pImageFormatInfo != null ? pImageFormatInfo.getVkAddress() : VkPointer.NULL, pImageFormatProperties != null ? pImageFormatProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long physicalDevice, long pImageFormatInfo, long pImageFormatProperties, long rval);
}

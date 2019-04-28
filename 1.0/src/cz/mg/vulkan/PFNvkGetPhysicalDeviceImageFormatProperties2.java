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

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VkImageFormatProperties2 pImageFormatProperties, VkResult rval){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pImageFormatInfo != null ? pImageFormatInfo.getVkAddress() : VkPointer.NULL, pImageFormatProperties != null ? pImageFormatProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pImageFormatInfo, long pImageFormatProperties, long rval);


    public int call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VkImageFormatProperties2 pImageFormatProperties){
        return callSimplifiedNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pImageFormatInfo != null ? pImageFormatInfo.getVkAddress() : VkPointer.NULL, pImageFormatProperties != null ? pImageFormatProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long physicalDevice, long pImageFormatInfo, long pImageFormatProperties);

}

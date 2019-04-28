package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceFormatProperties2 extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceFormatProperties2() {
    }

    protected PFNvkGetPhysicalDeviceFormatProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceFormatProperties2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceFormatProperties2(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceFormatProperties2(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceFormatProperties2"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties2 pFormatProperties){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative(), pFormatProperties != null ? pFormatProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long format, long pFormatProperties);


    public void call(VkPhysicalDevice physicalDevice, int format, VkFormatProperties2 pFormatProperties){
        callSimplifiedNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), format, pFormatProperties != null ? pFormatProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callSimplifiedNative(long vkaddress, long physicalDevice, int format, long pFormatProperties);

}

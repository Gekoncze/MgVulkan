package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceFormatProperties2KHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceFormatProperties2KHR() {
    }

    protected PFNvkGetPhysicalDeviceFormatProperties2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceFormatProperties2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceFormatProperties2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceFormatProperties2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceFormatProperties2KHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, int format, VkFormatProperties2 pFormatProperties){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), format, pFormatProperties != null ? pFormatProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, int format, long pFormatProperties);

}

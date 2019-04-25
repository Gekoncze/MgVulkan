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

    public void call(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties2 pFormatProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative(), pFormatProperties != null ? pFormatProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long physicalDevice, long format, long pFormatProperties);
}

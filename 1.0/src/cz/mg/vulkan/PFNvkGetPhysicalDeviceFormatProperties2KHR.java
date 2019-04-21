package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceFormatProperties2KHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceFormatProperties2KHR() {
    }

    public PFNvkGetPhysicalDeviceFormatProperties2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceFormatProperties2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceFormatProperties2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceFormatProperties2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceFormatProperties2KHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties2KHR pFormatProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddress(), pFormatProperties != null ? pFormatProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long format, long pFormatProperties);
}

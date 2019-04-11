package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceFormatProperties2 extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceFormatProperties2() {
    }

    public PFNvkGetPhysicalDeviceFormatProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceFormatProperties2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceFormatProperties2(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceFormatProperties2(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceFormatProperties2"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties2 pFormatProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddress(), pFormatProperties != null ? pFormatProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long format, long pFormatProperties);
}

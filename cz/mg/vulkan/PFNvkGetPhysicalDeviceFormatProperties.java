package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceFormatProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceFormatProperties() {
    }

    public PFNvkGetPhysicalDeviceFormatProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceFormatProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceFormatProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceFormatProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties pFormatProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getSinkAddress(), format != null ? format.getVkAddress() : VkPointer.getSinkAddress(), pFormatProperties != null ? pFormatProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long format, long pFormatProperties);
}

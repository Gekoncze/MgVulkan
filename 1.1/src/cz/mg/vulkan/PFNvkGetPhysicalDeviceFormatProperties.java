package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceFormatProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceFormatProperties() {
    }

    protected PFNvkGetPhysicalDeviceFormatProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceFormatProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceFormatProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceFormatProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties pFormatProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative(), pFormatProperties != null ? pFormatProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long physicalDevice, long format, long pFormatProperties);
}

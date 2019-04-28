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

    public void call(VkPhysicalDevice physicalDevice, int format, VkFormatProperties pFormatProperties){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), format, pFormatProperties != null ? pFormatProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, int format, long pFormatProperties);

}

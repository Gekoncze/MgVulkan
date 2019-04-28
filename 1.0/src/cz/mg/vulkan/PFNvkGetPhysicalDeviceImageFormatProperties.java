package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceImageFormatProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceImageFormatProperties() {
    }

    protected PFNvkGetPhysicalDeviceImageFormatProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceImageFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceImageFormatProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceImageFormatProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceImageFormatProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkImageTiling tiling, VkImageUsageFlags usage, VkImageCreateFlags flags, VkImageFormatProperties pImageFormatProperties, VkResult rval){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative(), type != null ? type.getVkAddress() : VkPointer.getNullAddressNative(), tiling != null ? tiling.getVkAddress() : VkPointer.getNullAddressNative(), usage != null ? usage.getVkAddress() : VkPointer.getNullAddressNative(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative(), pImageFormatProperties != null ? pImageFormatProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long format, long type, long tiling, long usage, long flags, long pImageFormatProperties, long rval);


    public int call(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, VkImageFormatProperties pImageFormatProperties){
        return callSimplifiedNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), format, type, tiling, usage, flags, pImageFormatProperties != null ? pImageFormatProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long physicalDevice, int format, int type, int tiling, int usage, int flags, long pImageFormatProperties);

}

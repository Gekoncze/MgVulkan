package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV() {
    }

    protected PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalImageFormatPropertiesNV"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkImageTiling tiling, VkImageUsageFlags usage, VkImageCreateFlags flags, VkExternalMemoryHandleTypeFlagsNV externalHandleType, VkExternalImageFormatPropertiesNV pExternalImageFormatProperties, VkResult rval){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative(), type != null ? type.getVkAddress() : VkPointer.getNullAddressNative(), tiling != null ? tiling.getVkAddress() : VkPointer.getNullAddressNative(), usage != null ? usage.getVkAddress() : VkPointer.getNullAddressNative(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative(), externalHandleType != null ? externalHandleType.getVkAddress() : VkPointer.getNullAddressNative(), pExternalImageFormatProperties != null ? pExternalImageFormatProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long format, long type, long tiling, long usage, long flags, long externalHandleType, long pExternalImageFormatProperties, long rval);


    public int call(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, int externalHandleType, VkExternalImageFormatPropertiesNV pExternalImageFormatProperties){
        return callSimplifiedNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), format, type, tiling, usage, flags, externalHandleType, pExternalImageFormatProperties != null ? pExternalImageFormatProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long physicalDevice, int format, int type, int tiling, int usage, int flags, int externalHandleType, long pExternalImageFormatProperties);

}

package cz.mg.vulkan.vk;

public class PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV() {
    }

    public PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalImageFormatPropertiesNV(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalImageFormatPropertiesNV"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkImageTiling tiling, VkImageUsageFlags usage, VkImageCreateFlags flags, VkExternalMemoryHandleTypeFlagsNV externalHandleType, VkExternalImageFormatPropertiesNV pExternalImageFormatProperties, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, format != null ? format.getVkAddress() : VkPointer.NULL_ADDRESS, type != null ? type.getVkAddress() : VkPointer.NULL_ADDRESS, tiling != null ? tiling.getVkAddress() : VkPointer.NULL_ADDRESS, usage != null ? usage.getVkAddress() : VkPointer.NULL_ADDRESS, flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS, externalHandleType != null ? externalHandleType.getVkAddress() : VkPointer.NULL_ADDRESS, pExternalImageFormatProperties != null ? pExternalImageFormatProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long physicalDevice, long format, long type, long tiling, long usage, long flags, long externalHandleType, long pExternalImageFormatProperties, long rval);
}

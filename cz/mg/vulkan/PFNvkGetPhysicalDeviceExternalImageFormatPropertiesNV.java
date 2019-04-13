package cz.mg.vulkan;

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
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getSinkAddress(), format != null ? format.getVkAddress() : VkPointer.getSinkAddress(), type != null ? type.getVkAddress() : VkPointer.getSinkAddress(), tiling != null ? tiling.getVkAddress() : VkPointer.getSinkAddress(), usage != null ? usage.getVkAddress() : VkPointer.getSinkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress(), externalHandleType != null ? externalHandleType.getVkAddress() : VkPointer.getSinkAddress(), pExternalImageFormatProperties != null ? pExternalImageFormatProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long physicalDevice, long format, long type, long tiling, long usage, long flags, long externalHandleType, long pExternalImageFormatProperties, long rval);
}

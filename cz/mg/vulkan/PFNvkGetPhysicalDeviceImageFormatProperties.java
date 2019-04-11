package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceImageFormatProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceImageFormatProperties() {
    }

    public PFNvkGetPhysicalDeviceImageFormatProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceImageFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceImageFormatProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceImageFormatProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceImageFormatProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkImageTiling tiling, VkImageUsageFlags usage, VkImageCreateFlags flags, VkImageFormatProperties pImageFormatProperties, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddress(), type != null ? type.getVkAddress() : VkPointer.getNullAddress(), tiling != null ? tiling.getVkAddress() : VkPointer.getNullAddress(), usage != null ? usage.getVkAddress() : VkPointer.getNullAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress(), pImageFormatProperties != null ? pImageFormatProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long physicalDevice, long format, long type, long tiling, long usage, long flags, long pImageFormatProperties, long rval);
}

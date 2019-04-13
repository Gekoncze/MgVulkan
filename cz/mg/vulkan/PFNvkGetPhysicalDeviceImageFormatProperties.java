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
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getSinkAddress(), format != null ? format.getVkAddress() : VkPointer.getSinkAddress(), type != null ? type.getVkAddress() : VkPointer.getSinkAddress(), tiling != null ? tiling.getVkAddress() : VkPointer.getSinkAddress(), usage != null ? usage.getVkAddress() : VkPointer.getSinkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress(), pImageFormatProperties != null ? pImageFormatProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long physicalDevice, long format, long type, long tiling, long usage, long flags, long pImageFormatProperties, long rval);
}

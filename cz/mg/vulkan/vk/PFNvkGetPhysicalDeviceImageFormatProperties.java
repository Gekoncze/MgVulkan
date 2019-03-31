package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceImageFormatProperties.html">khronos documentation</a>
 **/
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
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPhysicalDevice.NULL.getVkAddress(), format != null ? format.getVkAddress() : VkPointer.NULL, type != null ? type.getVkAddress() : VkPointer.NULL, tiling != null ? tiling.getVkAddress() : VkPointer.NULL, usage != null ? usage.getVkAddress() : VkPointer.NULL, flags != null ? flags.getVkAddress() : VkPointer.NULL, pImageFormatProperties != null ? pImageFormatProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long format, long type, long tiling, long usage, long flags, long pImageFormatProperties, long rval);
}

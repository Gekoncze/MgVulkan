package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceImageFormatProperties2KHR.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceImageFormatProperties2KHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceImageFormatProperties2KHR() {
    }

    public PFNvkGetPhysicalDeviceImageFormatProperties2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceImageFormatProperties2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceImageFormatProperties2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceImageFormatProperties2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceImageFormatProperties2KHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, VkImageFormatProperties2 pImageFormatProperties, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, pImageFormatInfo != null ? pImageFormatInfo.getVkAddress() : VkPointer.NULL, pImageFormatProperties != null ? pImageFormatProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long physicalDevice, long pImageFormatInfo, long pImageFormatProperties, long rval);
}

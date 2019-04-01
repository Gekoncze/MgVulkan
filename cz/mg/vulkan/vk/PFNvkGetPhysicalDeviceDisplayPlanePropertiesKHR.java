package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR() {
    }

    public PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceDisplayPlanePropertiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkDisplayPlanePropertiesKHR pProperties, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long physicalDevice, long pPropertyCount, long pProperties, long rval);
}

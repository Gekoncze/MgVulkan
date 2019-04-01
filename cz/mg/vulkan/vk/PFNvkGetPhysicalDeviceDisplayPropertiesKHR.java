package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceDisplayPropertiesKHR.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceDisplayPropertiesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceDisplayPropertiesKHR() {
    }

    public PFNvkGetPhysicalDeviceDisplayPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceDisplayPropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceDisplayPropertiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceDisplayPropertiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceDisplayPropertiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkDisplayPropertiesKHR pProperties, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long physicalDevice, long pPropertyCount, long pProperties, long rval);
}

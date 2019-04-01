package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceQueueFamilyProperties.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceQueueFamilyProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceQueueFamilyProperties() {
    }

    public PFNvkGetPhysicalDeviceQueueFamilyProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceQueueFamilyProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceQueueFamilyProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceQueueFamilyProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceQueueFamilyProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkUInt32 pQueueFamilyPropertyCount, VkQueueFamilyProperties pQueueFamilyProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, pQueueFamilyPropertyCount != null ? pQueueFamilyPropertyCount.getVkAddress() : VkPointer.NULL, pQueueFamilyProperties != null ? pQueueFamilyProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pQueueFamilyPropertyCount, long pQueueFamilyProperties);
}

package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceQueueFamilyProperties2.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceQueueFamilyProperties2 extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceQueueFamilyProperties2() {
    }

    public PFNvkGetPhysicalDeviceQueueFamilyProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceQueueFamilyProperties2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceQueueFamilyProperties2(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceQueueFamilyProperties2(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceQueueFamilyProperties2"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkUInt32 pQueueFamilyPropertyCount, VkQueueFamilyProperties2 pQueueFamilyProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, pQueueFamilyPropertyCount != null ? pQueueFamilyPropertyCount.getVkAddress() : VkPointer.NULL, pQueueFamilyProperties != null ? pQueueFamilyProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pQueueFamilyPropertyCount, long pQueueFamilyProperties);
}

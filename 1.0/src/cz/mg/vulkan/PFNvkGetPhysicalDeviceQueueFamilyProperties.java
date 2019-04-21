package cz.mg.vulkan;

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
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddress(), pQueueFamilyPropertyCount != null ? pQueueFamilyPropertyCount.getVkAddress() : VkPointer.NULL, pQueueFamilyProperties != null ? pQueueFamilyProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pQueueFamilyPropertyCount, long pQueueFamilyProperties);
}

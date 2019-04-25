package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceQueueFamilyProperties2KHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceQueueFamilyProperties2KHR() {
    }

    protected PFNvkGetPhysicalDeviceQueueFamilyProperties2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceQueueFamilyProperties2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceQueueFamilyProperties2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceQueueFamilyProperties2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceQueueFamilyProperties2KHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkUInt32 pQueueFamilyPropertyCount, VkQueueFamilyProperties2KHR pQueueFamilyProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pQueueFamilyPropertyCount != null ? pQueueFamilyPropertyCount.getVkAddress() : VkPointer.NULL, pQueueFamilyProperties != null ? pQueueFamilyProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long physicalDevice, long pQueueFamilyPropertyCount, long pQueueFamilyProperties);
}

package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceMemoryProperties2KHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceMemoryProperties2KHR() {
    }

    public PFNvkGetPhysicalDeviceMemoryProperties2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceMemoryProperties2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceMemoryProperties2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceMemoryProperties2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceMemoryProperties2KHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2KHR pMemoryProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddress(), pMemoryProperties != null ? pMemoryProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pMemoryProperties);
}

package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceMemoryProperties2KHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceMemoryProperties2KHR() {
    }

    protected PFNvkGetPhysicalDeviceMemoryProperties2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceMemoryProperties2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceMemoryProperties2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceMemoryProperties2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceMemoryProperties2KHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2 pMemoryProperties){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pMemoryProperties != null ? pMemoryProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pMemoryProperties);



}

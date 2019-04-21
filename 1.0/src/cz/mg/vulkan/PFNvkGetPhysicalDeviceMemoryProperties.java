package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceMemoryProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceMemoryProperties() {
    }

    public PFNvkGetPhysicalDeviceMemoryProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceMemoryProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceMemoryProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceMemoryProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceMemoryProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties pMemoryProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddress(), pMemoryProperties != null ? pMemoryProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pMemoryProperties);
}

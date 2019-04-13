package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceMemoryProperties2 extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceMemoryProperties2() {
    }

    public PFNvkGetPhysicalDeviceMemoryProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceMemoryProperties2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceMemoryProperties2(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceMemoryProperties2(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceMemoryProperties2"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2 pMemoryProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getSinkAddress(), pMemoryProperties != null ? pMemoryProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pMemoryProperties);
}

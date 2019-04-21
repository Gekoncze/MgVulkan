package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceProperties2KHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceProperties2KHR() {
    }

    public PFNvkGetPhysicalDeviceProperties2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceProperties2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceProperties2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceProperties2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceProperties2KHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties2KHR pProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddress(), pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pProperties);
}

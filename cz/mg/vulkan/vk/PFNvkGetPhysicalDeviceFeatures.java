package cz.mg.vulkan.vk;

public class PFNvkGetPhysicalDeviceFeatures extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceFeatures() {
    }

    public PFNvkGetPhysicalDeviceFeatures(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceFeatures(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceFeatures(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceFeatures(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceFeatures"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures pFeatures){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, pFeatures != null ? pFeatures.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pFeatures);
}

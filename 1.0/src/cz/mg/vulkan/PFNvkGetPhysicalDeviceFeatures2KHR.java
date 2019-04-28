package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceFeatures2KHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceFeatures2KHR() {
    }

    protected PFNvkGetPhysicalDeviceFeatures2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceFeatures2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceFeatures2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceFeatures2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceFeatures2KHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures2 pFeatures){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pFeatures != null ? pFeatures.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pFeatures);

}

package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceFeatures extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceFeatures() {
    }

    protected PFNvkGetPhysicalDeviceFeatures(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceFeatures(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceFeatures(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceFeatures(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceFeatures"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures pFeatures){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pFeatures != null ? pFeatures.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pFeatures);



}

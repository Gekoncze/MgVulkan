package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceFeatures2 extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceFeatures2() {
    }

    protected PFNvkGetPhysicalDeviceFeatures2(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceFeatures2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceFeatures2(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceFeatures2(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceFeatures2"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures2 pFeatures){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pFeatures != null ? pFeatures.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pFeatures);

}

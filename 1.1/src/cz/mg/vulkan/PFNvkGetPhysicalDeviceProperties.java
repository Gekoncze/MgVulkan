package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceProperties() {
    }

    protected PFNvkGetPhysicalDeviceProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties pProperties){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pProperties);



}

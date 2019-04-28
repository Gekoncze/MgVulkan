package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceMemoryProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceMemoryProperties() {
    }

    protected PFNvkGetPhysicalDeviceMemoryProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceMemoryProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceMemoryProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceMemoryProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceMemoryProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties pMemoryProperties){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pMemoryProperties != null ? pMemoryProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pMemoryProperties);



}

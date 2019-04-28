package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceMemoryProperties2 extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceMemoryProperties2() {
    }

    protected PFNvkGetPhysicalDeviceMemoryProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceMemoryProperties2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceMemoryProperties2(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceMemoryProperties2(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceMemoryProperties2"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2 pMemoryProperties){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pMemoryProperties != null ? pMemoryProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pMemoryProperties);



}

package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceProperties2 extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceProperties2() {
    }

    protected PFNvkGetPhysicalDeviceProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceProperties2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceProperties2(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceProperties2(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceProperties2"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties2 pProperties){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pProperties);



}

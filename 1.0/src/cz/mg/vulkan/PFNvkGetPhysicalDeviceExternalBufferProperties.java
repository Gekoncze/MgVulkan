package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceExternalBufferProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalBufferProperties() {
    }

    protected PFNvkGetPhysicalDeviceExternalBufferProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceExternalBufferProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceExternalBufferProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalBufferProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalBufferProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalBufferInfo pExternalBufferInfo, VkExternalBufferProperties pExternalBufferProperties){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pExternalBufferInfo != null ? pExternalBufferInfo.getVkAddress() : VkPointer.NULL, pExternalBufferProperties != null ? pExternalBufferProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pExternalBufferInfo, long pExternalBufferProperties);

}

package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR() {
    }

    protected PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalBufferPropertiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalBufferPropertiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalBufferInfo pExternalBufferInfo, VkExternalBufferProperties pExternalBufferProperties){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pExternalBufferInfo != null ? pExternalBufferInfo.getVkAddress() : VkPointer.NULL, pExternalBufferProperties != null ? pExternalBufferProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pExternalBufferInfo, long pExternalBufferProperties);



}

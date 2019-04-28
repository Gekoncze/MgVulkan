package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceExternalFenceProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalFenceProperties() {
    }

    protected PFNvkGetPhysicalDeviceExternalFenceProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceExternalFenceProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceExternalFenceProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalFenceProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalFenceProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo, VkExternalFenceProperties pExternalFenceProperties){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pExternalFenceInfo != null ? pExternalFenceInfo.getVkAddress() : VkPointer.NULL, pExternalFenceProperties != null ? pExternalFenceProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pExternalFenceInfo, long pExternalFenceProperties);

}

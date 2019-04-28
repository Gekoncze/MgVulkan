package cz.mg.vulkan;

public class PFNvkEnumerateDeviceExtensionProperties extends VkFunctionPointer {
    public PFNvkEnumerateDeviceExtensionProperties() {
    }

    protected PFNvkEnumerateDeviceExtensionProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkEnumerateDeviceExtensionProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkEnumerateDeviceExtensionProperties(long value) {
        setValue(value);
    }

    public PFNvkEnumerateDeviceExtensionProperties(VkInstance instance) {
        super(instance, new VkString("vkEnumerateDeviceExtensionProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkChar pLayerName, VkUInt32 pPropertyCount, VkExtensionProperties pProperties, VkResult rval){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pLayerName != null ? pLayerName.getVkAddress() : VkPointer.NULL, pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pLayerName, long pPropertyCount, long pProperties, long rval);


    public int call(VkPhysicalDevice physicalDevice, VkChar pLayerName, VkUInt32 pPropertyCount, VkExtensionProperties pProperties){
        return callSimplifiedNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pLayerName != null ? pLayerName.getVkAddress() : VkPointer.NULL, pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long physicalDevice, long pLayerName, long pPropertyCount, long pProperties);

}

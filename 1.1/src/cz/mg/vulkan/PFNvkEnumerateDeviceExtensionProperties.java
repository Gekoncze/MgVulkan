package cz.mg.vulkan;

public class PFNvkEnumerateDeviceExtensionProperties extends VkFunctionPointer {
    public PFNvkEnumerateDeviceExtensionProperties() {
    }

    public PFNvkEnumerateDeviceExtensionProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkEnumerateDeviceExtensionProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkEnumerateDeviceExtensionProperties(long value) {
        setValue(value);
    }

    public PFNvkEnumerateDeviceExtensionProperties(VkInstance instance) {
        super(instance, new VkString("vkEnumerateDeviceExtensionProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkChar pLayerName, VkUInt32 pPropertyCount, VkExtensionProperties pProperties, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddress(), pLayerName != null ? pLayerName.getVkAddress() : VkPointer.NULL, pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    protected static native void call(long vkaddress, long physicalDevice, long pLayerName, long pPropertyCount, long pProperties, long rval);
}

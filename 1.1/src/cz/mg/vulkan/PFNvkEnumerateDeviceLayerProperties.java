package cz.mg.vulkan;

public class PFNvkEnumerateDeviceLayerProperties extends VkFunctionPointer {
    public PFNvkEnumerateDeviceLayerProperties() {
    }

    protected PFNvkEnumerateDeviceLayerProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkEnumerateDeviceLayerProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkEnumerateDeviceLayerProperties(long value) {
        setValue(value);
    }

    public PFNvkEnumerateDeviceLayerProperties(VkInstance instance) {
        super(instance, new VkString("vkEnumerateDeviceLayerProperties"));
    }

    public int call(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkLayerProperties pProperties){
        return callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long physicalDevice, long pPropertyCount, long pProperties);

}

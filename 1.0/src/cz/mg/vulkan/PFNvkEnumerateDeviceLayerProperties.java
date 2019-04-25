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

    public void call(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkLayerProperties pProperties, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long physicalDevice, long pPropertyCount, long pProperties, long rval);
}

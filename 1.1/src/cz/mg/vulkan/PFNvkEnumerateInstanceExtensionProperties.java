package cz.mg.vulkan;

public class PFNvkEnumerateInstanceExtensionProperties extends VkFunctionPointer {
    public PFNvkEnumerateInstanceExtensionProperties() {
    }

    protected PFNvkEnumerateInstanceExtensionProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkEnumerateInstanceExtensionProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkEnumerateInstanceExtensionProperties(long value) {
        setValue(value);
    }

    public PFNvkEnumerateInstanceExtensionProperties(VkInstance instance) {
        super(instance, new VkString("vkEnumerateInstanceExtensionProperties"));
    }

    public void call(VkChar pLayerName, VkUInt32 pPropertyCount, VkExtensionProperties pProperties, VkResult rval){
        callNative(getValue(), pLayerName != null ? pLayerName.getVkAddress() : VkPointer.NULL, pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long pLayerName, long pPropertyCount, long pProperties, long rval);


    public int call(VkChar pLayerName, VkUInt32 pPropertyCount, VkExtensionProperties pProperties){
        return callSimplifiedNative(getValue(), pLayerName != null ? pLayerName.getVkAddress() : VkPointer.NULL, pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long pLayerName, long pPropertyCount, long pProperties);

}

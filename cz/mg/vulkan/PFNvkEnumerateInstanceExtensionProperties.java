package cz.mg.vulkan;

public class PFNvkEnumerateInstanceExtensionProperties extends VkFunctionPointer {
    public PFNvkEnumerateInstanceExtensionProperties() {
    }

    public PFNvkEnumerateInstanceExtensionProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkEnumerateInstanceExtensionProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkEnumerateInstanceExtensionProperties(long value) {
        setValue(value);
    }

    public PFNvkEnumerateInstanceExtensionProperties(VkInstance instance) {
        super(instance, new VkString("vkEnumerateInstanceExtensionProperties"));
    }

    public void call(VkChar pLayerName, VkUInt32 pPropertyCount, VkExtensionProperties pProperties, VkResult rval){
        call(getValue(), pLayerName != null ? pLayerName.getVkAddress() : VkPointer.NULL, pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long pLayerName, long pPropertyCount, long pProperties, long rval);
}

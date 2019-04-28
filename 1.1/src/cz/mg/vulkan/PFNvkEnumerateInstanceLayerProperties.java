package cz.mg.vulkan;

public class PFNvkEnumerateInstanceLayerProperties extends VkFunctionPointer {
    public PFNvkEnumerateInstanceLayerProperties() {
    }

    protected PFNvkEnumerateInstanceLayerProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkEnumerateInstanceLayerProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkEnumerateInstanceLayerProperties(long value) {
        setValue(value);
    }

    public PFNvkEnumerateInstanceLayerProperties(VkInstance instance) {
        super(instance, new VkString("vkEnumerateInstanceLayerProperties"));
    }

    public void call(VkUInt32 pPropertyCount, VkLayerProperties pProperties, VkResult rval){
        callNative(getValue(), pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long pPropertyCount, long pProperties, long rval);


    public int call(VkUInt32 pPropertyCount, VkLayerProperties pProperties){
        return callSimplifiedNative(getValue(), pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long pPropertyCount, long pProperties);

}

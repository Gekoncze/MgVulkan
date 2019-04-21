package cz.mg.vulkan;

public class PFNvkEnumerateInstanceLayerProperties extends VkFunctionPointer {
    public PFNvkEnumerateInstanceLayerProperties() {
    }

    public PFNvkEnumerateInstanceLayerProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkEnumerateInstanceLayerProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkEnumerateInstanceLayerProperties(long value) {
        setValue(value);
    }

    public PFNvkEnumerateInstanceLayerProperties(VkInstance instance) {
        super(instance, new VkString("vkEnumerateInstanceLayerProperties"));
    }

    public void call(VkUInt32 pPropertyCount, VkLayerProperties pProperties, VkResult rval){
        call(getValue(), pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long pPropertyCount, long pProperties, long rval);
}

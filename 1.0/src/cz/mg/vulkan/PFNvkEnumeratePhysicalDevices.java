package cz.mg.vulkan;

public class PFNvkEnumeratePhysicalDevices extends VkFunctionPointer {
    public PFNvkEnumeratePhysicalDevices() {
    }

    protected PFNvkEnumeratePhysicalDevices(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkEnumeratePhysicalDevices(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkEnumeratePhysicalDevices(long value) {
        setValue(value);
    }

    public PFNvkEnumeratePhysicalDevices(VkInstance instance) {
        super(instance, new VkString("vkEnumeratePhysicalDevices"));
    }

    public void call(VkInstance instance, VkUInt32 pPhysicalDeviceCount, VkPhysicalDevice pPhysicalDevices, VkResult rval){
        callNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), pPhysicalDeviceCount != null ? pPhysicalDeviceCount.getVkAddress() : VkPointer.NULL, pPhysicalDevices != null ? pPhysicalDevices.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long instance, long pPhysicalDeviceCount, long pPhysicalDevices, long rval);


    public int call(VkInstance instance, VkUInt32 pPhysicalDeviceCount, VkPhysicalDevice pPhysicalDevices){
        return callSimplifiedNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), pPhysicalDeviceCount != null ? pPhysicalDeviceCount.getVkAddress() : VkPointer.NULL, pPhysicalDevices != null ? pPhysicalDevices.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long instance, long pPhysicalDeviceCount, long pPhysicalDevices);

}

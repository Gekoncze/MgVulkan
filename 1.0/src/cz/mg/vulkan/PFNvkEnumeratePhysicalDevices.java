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

    public int call(VkInstance instance, VkUInt32 pPhysicalDeviceCount, VkPhysicalDevice pPhysicalDevices){
        return callNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), pPhysicalDeviceCount != null ? pPhysicalDeviceCount.getVkAddress() : VkPointer.NULL, pPhysicalDevices != null ? pPhysicalDevices.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long instance, long pPhysicalDeviceCount, long pPhysicalDevices);

}

package cz.mg.vulkan;

public class PFNvkEnumeratePhysicalDevices extends VkFunctionPointer {
    public PFNvkEnumeratePhysicalDevices() {
    }

    public PFNvkEnumeratePhysicalDevices(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkEnumeratePhysicalDevices(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkEnumeratePhysicalDevices(long value) {
        setValue(value);
    }

    public PFNvkEnumeratePhysicalDevices(VkInstance instance) {
        super(instance, new VkString("vkEnumeratePhysicalDevices"));
    }

    public void call(VkInstance instance, VkUInt32 pPhysicalDeviceCount, VkPhysicalDevice pPhysicalDevices, VkResult rval){
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddress(), pPhysicalDeviceCount != null ? pPhysicalDeviceCount.getVkAddress() : VkPointer.NULL, pPhysicalDevices != null ? pPhysicalDevices.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long instance, long pPhysicalDeviceCount, long pPhysicalDevices, long rval);
}

package cz.mg.vulkan;

public class PFNvkEnumeratePhysicalDeviceGroupsKHR extends VkFunctionPointer {
    public PFNvkEnumeratePhysicalDeviceGroupsKHR() {
    }

    protected PFNvkEnumeratePhysicalDeviceGroupsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkEnumeratePhysicalDeviceGroupsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkEnumeratePhysicalDeviceGroupsKHR(long value) {
        setValue(value);
    }

    public PFNvkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance) {
        super(instance, new VkString("vkEnumeratePhysicalDeviceGroupsKHR"));
    }

    public int call(VkInstance instance, VkUInt32 pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties pPhysicalDeviceGroupProperties){
        return callNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), pPhysicalDeviceGroupCount != null ? pPhysicalDeviceGroupCount.getVkAddress() : VkPointer.NULL, pPhysicalDeviceGroupProperties != null ? pPhysicalDeviceGroupProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long instance, long pPhysicalDeviceGroupCount, long pPhysicalDeviceGroupProperties);

}

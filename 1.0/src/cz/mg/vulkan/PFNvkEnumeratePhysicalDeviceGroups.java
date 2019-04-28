package cz.mg.vulkan;

public class PFNvkEnumeratePhysicalDeviceGroups extends VkFunctionPointer {
    public PFNvkEnumeratePhysicalDeviceGroups() {
    }

    protected PFNvkEnumeratePhysicalDeviceGroups(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkEnumeratePhysicalDeviceGroups(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkEnumeratePhysicalDeviceGroups(long value) {
        setValue(value);
    }

    public PFNvkEnumeratePhysicalDeviceGroups(VkInstance instance) {
        super(instance, new VkString("vkEnumeratePhysicalDeviceGroups"));
    }

    public int call(VkInstance instance, VkUInt32 pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties pPhysicalDeviceGroupProperties){
        return callNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), pPhysicalDeviceGroupCount != null ? pPhysicalDeviceGroupCount.getVkAddress() : VkPointer.NULL, pPhysicalDeviceGroupProperties != null ? pPhysicalDeviceGroupProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long instance, long pPhysicalDeviceGroupCount, long pPhysicalDeviceGroupProperties);

}

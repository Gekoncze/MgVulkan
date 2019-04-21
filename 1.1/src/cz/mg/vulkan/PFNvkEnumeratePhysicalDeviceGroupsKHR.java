package cz.mg.vulkan;

public class PFNvkEnumeratePhysicalDeviceGroupsKHR extends VkFunctionPointer {
    public PFNvkEnumeratePhysicalDeviceGroupsKHR() {
    }

    public PFNvkEnumeratePhysicalDeviceGroupsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkEnumeratePhysicalDeviceGroupsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkEnumeratePhysicalDeviceGroupsKHR(long value) {
        setValue(value);
    }

    public PFNvkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance) {
        super(instance, new VkString("vkEnumeratePhysicalDeviceGroupsKHR"));
    }

    public void call(VkInstance instance, VkUInt32 pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties pPhysicalDeviceGroupProperties, VkResult rval){
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddress(), pPhysicalDeviceGroupCount != null ? pPhysicalDeviceGroupCount.getVkAddress() : VkPointer.NULL, pPhysicalDeviceGroupProperties != null ? pPhysicalDeviceGroupProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long instance, long pPhysicalDeviceGroupCount, long pPhysicalDeviceGroupProperties, long rval);
}

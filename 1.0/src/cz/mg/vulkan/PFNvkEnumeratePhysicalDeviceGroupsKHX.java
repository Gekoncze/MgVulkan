package cz.mg.vulkan;

public class PFNvkEnumeratePhysicalDeviceGroupsKHX extends VkFunctionPointer {
    public PFNvkEnumeratePhysicalDeviceGroupsKHX() {
    }

    public PFNvkEnumeratePhysicalDeviceGroupsKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkEnumeratePhysicalDeviceGroupsKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkEnumeratePhysicalDeviceGroupsKHX(long value) {
        setValue(value);
    }

    public PFNvkEnumeratePhysicalDeviceGroupsKHX(VkInstance instance) {
        super(instance, new VkString("vkEnumeratePhysicalDeviceGroupsKHX"));
    }

    public void call(VkInstance instance, VkUInt32 pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupPropertiesKHX pPhysicalDeviceGroupProperties, VkResult rval){
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), pPhysicalDeviceGroupCount != null ? pPhysicalDeviceGroupCount.getVkAddress() : VkPointer.NULL, pPhysicalDeviceGroupProperties != null ? pPhysicalDeviceGroupProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long instance, long pPhysicalDeviceGroupCount, long pPhysicalDeviceGroupProperties, long rval);
}

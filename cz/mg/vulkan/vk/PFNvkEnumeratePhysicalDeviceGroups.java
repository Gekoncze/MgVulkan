package cz.mg.vulkan.vk;

public class PFNvkEnumeratePhysicalDeviceGroups extends VkFunctionPointer {
    public PFNvkEnumeratePhysicalDeviceGroups() {
    }

    public PFNvkEnumeratePhysicalDeviceGroups(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkEnumeratePhysicalDeviceGroups(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkEnumeratePhysicalDeviceGroups(long value) {
        setValue(value);
    }

    public PFNvkEnumeratePhysicalDeviceGroups(VkInstance instance) {
        super(instance, new VkString("vkEnumeratePhysicalDeviceGroups"));
    }

    public void call(VkInstance instance, VkUInt32 pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties pPhysicalDeviceGroupProperties, VkResult rval){
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.NULL_ADDRESS, pPhysicalDeviceGroupCount != null ? pPhysicalDeviceGroupCount.getVkAddress() : VkPointer.NULL, pPhysicalDeviceGroupProperties != null ? pPhysicalDeviceGroupProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long instance, long pPhysicalDeviceGroupCount, long pPhysicalDeviceGroupProperties, long rval);
}

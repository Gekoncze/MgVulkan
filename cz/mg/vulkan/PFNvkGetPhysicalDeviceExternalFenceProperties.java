package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceExternalFenceProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalFenceProperties() {
    }

    public PFNvkGetPhysicalDeviceExternalFenceProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceExternalFenceProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceExternalFenceProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalFenceProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalFenceProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo, VkExternalFenceProperties pExternalFenceProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getSinkAddress(), pExternalFenceInfo != null ? pExternalFenceInfo.getVkAddress() : VkPointer.NULL, pExternalFenceProperties != null ? pExternalFenceProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pExternalFenceInfo, long pExternalFenceProperties);
}

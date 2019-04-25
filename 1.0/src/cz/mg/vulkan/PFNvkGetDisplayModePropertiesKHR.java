package cz.mg.vulkan;

public class PFNvkGetDisplayModePropertiesKHR extends VkFunctionPointer {
    public PFNvkGetDisplayModePropertiesKHR() {
    }

    public PFNvkGetDisplayModePropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDisplayModePropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDisplayModePropertiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetDisplayModePropertiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetDisplayModePropertiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkUInt32 pPropertyCount, VkDisplayModePropertiesKHR pProperties, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddress(), display != null ? display.getVkAddress() : VkPointer.getNullAddress(), pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    protected static native void call(long vkaddress, long physicalDevice, long display, long pPropertyCount, long pProperties, long rval);
}

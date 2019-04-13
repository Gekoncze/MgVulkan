package cz.mg.vulkan;

public class PFNvkGetDisplayPlaneCapabilitiesKHR extends VkFunctionPointer {
    public PFNvkGetDisplayPlaneCapabilitiesKHR() {
    }

    public PFNvkGetDisplayPlaneCapabilitiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDisplayPlaneCapabilitiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetDisplayPlaneCapabilitiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetDisplayPlaneCapabilitiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetDisplayPlaneCapabilitiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkDisplayModeKHR mode, VkUInt32 planeIndex, VkDisplayPlaneCapabilitiesKHR pCapabilities, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getSinkAddress(), mode != null ? mode.getVkAddress() : VkPointer.getSinkAddress(), planeIndex != null ? planeIndex.getVkAddress() : VkPointer.getSinkAddress(), pCapabilities != null ? pCapabilities.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long physicalDevice, long mode, long planeIndex, long pCapabilities, long rval);
}

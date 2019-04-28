package cz.mg.vulkan;

public class PFNvkGetDisplayPlaneCapabilitiesKHR extends VkFunctionPointer {
    public PFNvkGetDisplayPlaneCapabilitiesKHR() {
    }

    protected PFNvkGetDisplayPlaneCapabilitiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetDisplayPlaneCapabilitiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDisplayPlaneCapabilitiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetDisplayPlaneCapabilitiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetDisplayPlaneCapabilitiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkDisplayModeKHR mode, VkUInt32 planeIndex, VkDisplayPlaneCapabilitiesKHR pCapabilities, VkResult rval){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), mode != null ? mode.getVkAddress() : VkPointer.getNullAddressNative(), planeIndex != null ? planeIndex.getVkAddress() : VkPointer.getNullAddressNative(), pCapabilities != null ? pCapabilities.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long mode, long planeIndex, long pCapabilities, long rval);


    public int call(VkPhysicalDevice physicalDevice, VkDisplayModeKHR mode, int planeIndex, VkDisplayPlaneCapabilitiesKHR pCapabilities){
        return callSimplifiedNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), mode != null ? mode.getVkAddress() : VkPointer.getNullAddressNative(), planeIndex, pCapabilities != null ? pCapabilities.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long physicalDevice, long mode, int planeIndex, long pCapabilities);

}

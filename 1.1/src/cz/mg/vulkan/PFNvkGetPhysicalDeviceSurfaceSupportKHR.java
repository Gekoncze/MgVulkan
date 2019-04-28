package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceSurfaceSupportKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSurfaceSupportKHR() {
    }

    protected PFNvkGetPhysicalDeviceSurfaceSupportKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceSurfaceSupportKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceSurfaceSupportKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSurfaceSupportKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSurfaceSupportKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkUInt32 queueFamilyIndex, VkSurfaceKHR surface, VkBool32 pSupported, VkResult rval){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), queueFamilyIndex != null ? queueFamilyIndex.getVkAddress() : VkPointer.getNullAddressNative(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddressNative(), pSupported != null ? pSupported.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long queueFamilyIndex, long surface, long pSupported, long rval);


    public int call(VkPhysicalDevice physicalDevice, int queueFamilyIndex, VkSurfaceKHR surface, VkBool32 pSupported){
        return callSimplifiedNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), queueFamilyIndex, surface != null ? surface.getVkAddress() : VkPointer.getNullAddressNative(), pSupported != null ? pSupported.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long physicalDevice, int queueFamilyIndex, long surface, long pSupported);

}

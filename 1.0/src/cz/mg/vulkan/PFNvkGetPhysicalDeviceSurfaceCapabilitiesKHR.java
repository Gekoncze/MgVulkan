package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR() {
    }

    protected PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSurfaceCapabilitiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilitiesKHR pSurfaceCapabilities, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddressNative(), pSurfaceCapabilities != null ? pSurfaceCapabilities.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long physicalDevice, long surface, long pSurfaceCapabilities, long rval);
}

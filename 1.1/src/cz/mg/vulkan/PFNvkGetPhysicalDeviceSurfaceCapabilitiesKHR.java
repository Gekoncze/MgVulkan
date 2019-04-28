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

    public int call(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilitiesKHR pSurfaceCapabilities){
        return callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddressNative(), pSurfaceCapabilities != null ? pSurfaceCapabilities.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long physicalDevice, long surface, long pSurfaceCapabilities);

}

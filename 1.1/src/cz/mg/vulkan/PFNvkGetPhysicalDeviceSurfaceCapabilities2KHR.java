package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR() {
    }

    protected PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSurfaceCapabilities2KHR"));
    }

    public int call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VkSurfaceCapabilities2KHR pSurfaceCapabilities){
        return callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pSurfaceInfo != null ? pSurfaceInfo.getVkAddress() : VkPointer.NULL, pSurfaceCapabilities != null ? pSurfaceCapabilities.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long physicalDevice, long pSurfaceInfo, long pSurfaceCapabilities);

}

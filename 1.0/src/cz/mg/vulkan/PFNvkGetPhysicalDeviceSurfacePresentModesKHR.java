package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceSurfacePresentModesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSurfacePresentModesKHR() {
    }

    protected PFNvkGetPhysicalDeviceSurfacePresentModesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceSurfacePresentModesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceSurfacePresentModesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSurfacePresentModesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSurfacePresentModesKHR"));
    }

    public int call(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pPresentModeCount, VkPresentModeKHR pPresentModes){
        return callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddressNative(), pPresentModeCount != null ? pPresentModeCount.getVkAddress() : VkPointer.NULL, pPresentModes != null ? pPresentModes.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long physicalDevice, long surface, long pPresentModeCount, long pPresentModes);

}

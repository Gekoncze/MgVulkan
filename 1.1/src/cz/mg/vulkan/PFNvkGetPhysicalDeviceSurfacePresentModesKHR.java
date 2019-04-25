package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceSurfacePresentModesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSurfacePresentModesKHR() {
    }

    public PFNvkGetPhysicalDeviceSurfacePresentModesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceSurfacePresentModesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceSurfacePresentModesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSurfacePresentModesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSurfacePresentModesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pPresentModeCount, VkPresentModeKHR pPresentModes, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddress(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddress(), pPresentModeCount != null ? pPresentModeCount.getVkAddress() : VkPointer.NULL, pPresentModes != null ? pPresentModes.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    protected static native void call(long vkaddress, long physicalDevice, long surface, long pPresentModeCount, long pPresentModes, long rval);
}

package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceSurfaceFormats2KHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSurfaceFormats2KHR() {
    }

    public PFNvkGetPhysicalDeviceSurfaceFormats2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceSurfaceFormats2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceSurfaceFormats2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSurfaceFormats2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSurfaceFormats2KHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VkUInt32 pSurfaceFormatCount, VkSurfaceFormat2KHR pSurfaceFormats, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddress(), pSurfaceInfo != null ? pSurfaceInfo.getVkAddress() : VkPointer.NULL, pSurfaceFormatCount != null ? pSurfaceFormatCount.getVkAddress() : VkPointer.NULL, pSurfaceFormats != null ? pSurfaceFormats.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long physicalDevice, long pSurfaceInfo, long pSurfaceFormatCount, long pSurfaceFormats, long rval);
}

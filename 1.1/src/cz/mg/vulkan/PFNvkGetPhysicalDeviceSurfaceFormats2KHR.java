package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceSurfaceFormats2KHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSurfaceFormats2KHR() {
    }

    protected PFNvkGetPhysicalDeviceSurfaceFormats2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceSurfaceFormats2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceSurfaceFormats2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSurfaceFormats2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSurfaceFormats2KHR"));
    }

    public int call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VkUInt32 pSurfaceFormatCount, VkSurfaceFormat2KHR pSurfaceFormats){
        return callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pSurfaceInfo != null ? pSurfaceInfo.getVkAddress() : VkPointer.NULL, pSurfaceFormatCount != null ? pSurfaceFormatCount.getVkAddress() : VkPointer.NULL, pSurfaceFormats != null ? pSurfaceFormats.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long physicalDevice, long pSurfaceInfo, long pSurfaceFormatCount, long pSurfaceFormats);

}

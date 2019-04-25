package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceSurfaceFormatsKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSurfaceFormatsKHR() {
    }

    protected PFNvkGetPhysicalDeviceSurfaceFormatsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceSurfaceFormatsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceSurfaceFormatsKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSurfaceFormatsKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSurfaceFormatsKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pSurfaceFormatCount, VkSurfaceFormatKHR pSurfaceFormats, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddressNative(), pSurfaceFormatCount != null ? pSurfaceFormatCount.getVkAddress() : VkPointer.NULL, pSurfaceFormats != null ? pSurfaceFormats.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long physicalDevice, long surface, long pSurfaceFormatCount, long pSurfaceFormats, long rval);
}

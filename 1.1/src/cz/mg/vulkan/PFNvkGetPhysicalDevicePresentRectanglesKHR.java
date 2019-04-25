package cz.mg.vulkan;

public class PFNvkGetPhysicalDevicePresentRectanglesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDevicePresentRectanglesKHR() {
    }

    public PFNvkGetPhysicalDevicePresentRectanglesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDevicePresentRectanglesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDevicePresentRectanglesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDevicePresentRectanglesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDevicePresentRectanglesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pRectCount, VkRect2D pRects, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddressNative(), pRectCount != null ? pRectCount.getVkAddress() : VkPointer.NULL, pRects != null ? pRects.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long physicalDevice, long surface, long pRectCount, long pRects, long rval);
}

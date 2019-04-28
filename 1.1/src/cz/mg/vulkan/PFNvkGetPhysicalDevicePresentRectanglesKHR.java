package cz.mg.vulkan;

public class PFNvkGetPhysicalDevicePresentRectanglesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDevicePresentRectanglesKHR() {
    }

    protected PFNvkGetPhysicalDevicePresentRectanglesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDevicePresentRectanglesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDevicePresentRectanglesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDevicePresentRectanglesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDevicePresentRectanglesKHR"));
    }

    public int call(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pRectCount, VkRect2D pRects){
        return callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddressNative(), pRectCount != null ? pRectCount.getVkAddress() : VkPointer.NULL, pRects != null ? pRects.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long physicalDevice, long surface, long pRectCount, long pRects);

}

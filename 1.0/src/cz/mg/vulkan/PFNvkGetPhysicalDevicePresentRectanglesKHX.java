package cz.mg.vulkan;

public class PFNvkGetPhysicalDevicePresentRectanglesKHX extends VkFunctionPointer {
    public PFNvkGetPhysicalDevicePresentRectanglesKHX() {
    }

    protected PFNvkGetPhysicalDevicePresentRectanglesKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDevicePresentRectanglesKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDevicePresentRectanglesKHX(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDevicePresentRectanglesKHX(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDevicePresentRectanglesKHX"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pRectCount, VkRect2D pRects, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddressNative(), pRectCount != null ? pRectCount.getVkAddress() : VkPointer.NULL, pRects != null ? pRects.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long physicalDevice, long surface, long pRectCount, long pRects, long rval);
}

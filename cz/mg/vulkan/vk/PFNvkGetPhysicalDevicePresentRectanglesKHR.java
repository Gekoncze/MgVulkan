package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDevicePresentRectanglesKHR.html">khronos documentation</a>
 **/
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
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPhysicalDevice.NULL.getVkAddress(), surface != null ? surface.getVkAddress() : VkSurfaceKHR.NULL.getVkAddress(), pRectCount != null ? pRectCount.getVkAddress() : VkPointer.NULL, pRects != null ? pRects.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long surface, long pRectCount, long pRects, long rval);
}

package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceSurfaceFormatsKHR.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceSurfaceFormatsKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSurfaceFormatsKHR() {
    }

    public PFNvkGetPhysicalDeviceSurfaceFormatsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceSurfaceFormatsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceSurfaceFormatsKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSurfaceFormatsKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSurfaceFormatsKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkUInt32 pSurfaceFormatCount, VkSurfaceFormatKHR pSurfaceFormats, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, surface != null ? surface.getVkAddress() : VkPointer.NULL_ADDRESS, pSurfaceFormatCount != null ? pSurfaceFormatCount.getVkAddress() : VkPointer.NULL, pSurfaceFormats != null ? pSurfaceFormats.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long physicalDevice, long surface, long pSurfaceFormatCount, long pSurfaceFormats, long rval);
}

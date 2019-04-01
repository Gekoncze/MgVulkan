package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR() {
    }

    public PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSurfaceCapabilities2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSurfaceCapabilities2KHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, VkSurfaceCapabilities2KHR pSurfaceCapabilities, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, pSurfaceInfo != null ? pSurfaceInfo.getVkAddress() : VkPointer.NULL, pSurfaceCapabilities != null ? pSurfaceCapabilities.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long physicalDevice, long pSurfaceInfo, long pSurfaceCapabilities, long rval);
}

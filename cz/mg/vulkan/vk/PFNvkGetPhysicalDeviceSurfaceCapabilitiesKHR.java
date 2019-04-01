package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR() {
    }

    public PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSurfaceCapabilitiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilitiesKHR pSurfaceCapabilities, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, surface != null ? surface.getVkAddress() : VkPointer.NULL_ADDRESS, pSurfaceCapabilities != null ? pSurfaceCapabilities.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long physicalDevice, long surface, long pSurfaceCapabilities, long rval);
}

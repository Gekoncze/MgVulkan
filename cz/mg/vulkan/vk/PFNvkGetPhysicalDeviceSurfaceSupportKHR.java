package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceSurfaceSupportKHR.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceSurfaceSupportKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSurfaceSupportKHR() {
    }

    public PFNvkGetPhysicalDeviceSurfaceSupportKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceSurfaceSupportKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceSurfaceSupportKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSurfaceSupportKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSurfaceSupportKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkUInt32 queueFamilyIndex, VkSurfaceKHR surface, VkBool32 pSupported, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPhysicalDevice.NULL.getVkAddress(), queueFamilyIndex != null ? queueFamilyIndex.getVkAddress() : VkPointer.NULL, surface != null ? surface.getVkAddress() : VkSurfaceKHR.NULL.getVkAddress(), pSupported != null ? pSupported.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long queueFamilyIndex, long surface, long pSupported, long rval);
}

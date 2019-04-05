package cz.mg.vulkan.vk;

public class PFNvkGetPhysicalDeviceSurfaceCapabilities2EXT extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSurfaceCapabilities2EXT() {
    }

    public PFNvkGetPhysicalDeviceSurfaceCapabilities2EXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceSurfaceCapabilities2EXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceSurfaceCapabilities2EXT(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSurfaceCapabilities2EXT(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSurfaceCapabilities2EXT"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilities2EXT pSurfaceCapabilities, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, surface != null ? surface.getVkAddress() : VkPointer.NULL_ADDRESS, pSurfaceCapabilities != null ? pSurfaceCapabilities.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long physicalDevice, long surface, long pSurfaceCapabilities, long rval);
}

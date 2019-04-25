package cz.mg.vulkan;

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
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddress(), queueFamilyIndex != null ? queueFamilyIndex.getVkAddress() : VkPointer.getNullAddress(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddress(), pSupported != null ? pSupported.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    protected static native void call(long vkaddress, long physicalDevice, long queueFamilyIndex, long surface, long pSupported, long rval);
}

package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDisplayPlaneCapabilitiesKHR.html">khronos documentation</a>
 **/
public class PFNvkGetDisplayPlaneCapabilitiesKHR extends VkFunctionPointer {
    public PFNvkGetDisplayPlaneCapabilitiesKHR() {
    }

    public PFNvkGetDisplayPlaneCapabilitiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDisplayPlaneCapabilitiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetDisplayPlaneCapabilitiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetDisplayPlaneCapabilitiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetDisplayPlaneCapabilitiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkDisplayModeKHR mode, VkUInt32 planeIndex, VkDisplayPlaneCapabilitiesKHR pCapabilities, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPhysicalDevice.NULL.getVkAddress(), mode != null ? mode.getVkAddress() : VkDisplayModeKHR.NULL.getVkAddress(), planeIndex != null ? planeIndex.getVkAddress() : VkPointer.NULL, pCapabilities != null ? pCapabilities.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long mode, long planeIndex, long pCapabilities, long rval);
}

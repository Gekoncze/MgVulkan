package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateDisplayModeKHR.html">khronos documentation</a>
 **/
public class PFNvkCreateDisplayModeKHR extends VkFunctionPointer {
    public PFNvkCreateDisplayModeKHR() {
    }

    public PFNvkCreateDisplayModeKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateDisplayModeKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateDisplayModeKHR(long value) {
        setValue(value);
    }

    public PFNvkCreateDisplayModeKHR(VkInstance instance) {
        super(instance, new VkString("vkCreateDisplayModeKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkDisplayModeCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkDisplayModeKHR pMode, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, display != null ? display.getVkAddress() : VkPointer.NULL_ADDRESS, pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pMode != null ? pMode.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long physicalDevice, long display, long pCreateInfo, long pAllocator, long pMode, long rval);
}

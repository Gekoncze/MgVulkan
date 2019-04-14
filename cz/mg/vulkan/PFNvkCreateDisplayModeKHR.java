package cz.mg.vulkan;

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
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddress(), display != null ? display.getVkAddress() : VkPointer.getNullAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pMode != null ? pMode.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long physicalDevice, long display, long pCreateInfo, long pAllocator, long pMode, long rval);
}

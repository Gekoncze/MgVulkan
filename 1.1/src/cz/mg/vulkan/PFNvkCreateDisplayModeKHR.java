package cz.mg.vulkan;

public class PFNvkCreateDisplayModeKHR extends VkFunctionPointer {
    public PFNvkCreateDisplayModeKHR() {
    }

    protected PFNvkCreateDisplayModeKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateDisplayModeKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateDisplayModeKHR(long value) {
        setValue(value);
    }

    public PFNvkCreateDisplayModeKHR(VkInstance instance) {
        super(instance, new VkString("vkCreateDisplayModeKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkDisplayModeCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkDisplayModeKHR pMode, VkResult rval){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), display != null ? display.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pMode != null ? pMode.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long display, long pCreateInfo, long pAllocator, long pMode, long rval);


    public int call(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkDisplayModeCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkDisplayModeKHR pMode){
        return callSimplifiedNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), display != null ? display.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pMode != null ? pMode.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long physicalDevice, long display, long pCreateInfo, long pAllocator, long pMode);

}

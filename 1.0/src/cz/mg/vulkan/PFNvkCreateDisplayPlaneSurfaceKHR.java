package cz.mg.vulkan;

public class PFNvkCreateDisplayPlaneSurfaceKHR extends VkFunctionPointer {
    public PFNvkCreateDisplayPlaneSurfaceKHR() {
    }

    protected PFNvkCreateDisplayPlaneSurfaceKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateDisplayPlaneSurfaceKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateDisplayPlaneSurfaceKHR(long value) {
        setValue(value);
    }

    public PFNvkCreateDisplayPlaneSurfaceKHR(VkInstance instance) {
        super(instance, new VkString("vkCreateDisplayPlaneSurfaceKHR"));
    }

    public void call(VkInstance instance, VkDisplaySurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkSurfaceKHR pSurface, VkResult rval){
        callNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSurface != null ? pSurface.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long instance, long pCreateInfo, long pAllocator, long pSurface, long rval);


    public int call(VkInstance instance, VkDisplaySurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkSurfaceKHR pSurface){
        return callSimplifiedNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSurface != null ? pSurface.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long instance, long pCreateInfo, long pAllocator, long pSurface);

}

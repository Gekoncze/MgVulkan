package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateDisplayPlaneSurfaceKHR.html">khronos documentation</a>
 **/
public class PFNvkCreateDisplayPlaneSurfaceKHR extends VkFunctionPointer {
    public PFNvkCreateDisplayPlaneSurfaceKHR() {
    }

    public PFNvkCreateDisplayPlaneSurfaceKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateDisplayPlaneSurfaceKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateDisplayPlaneSurfaceKHR(long value) {
        setValue(value);
    }

    public PFNvkCreateDisplayPlaneSurfaceKHR(VkInstance instance) {
        super(instance, new VkString("vkCreateDisplayPlaneSurfaceKHR"));
    }

    public void call(VkInstance instance, VkDisplaySurfaceCreateInfoKHR pCreateInfo, VkAllocationCallbacks pAllocator, VkSurfaceKHR pSurface, VkResult rval){
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.NULL_ADDRESS, pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pSurface != null ? pSurface.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long instance, long pCreateInfo, long pAllocator, long pSurface, long rval);
}

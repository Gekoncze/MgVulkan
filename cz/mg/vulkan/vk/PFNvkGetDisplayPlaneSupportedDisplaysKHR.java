package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDisplayPlaneSupportedDisplaysKHR.html">khronos documentation</a>
 **/
public class PFNvkGetDisplayPlaneSupportedDisplaysKHR extends VkFunctionPointer {
    public PFNvkGetDisplayPlaneSupportedDisplaysKHR() {
    }

    public PFNvkGetDisplayPlaneSupportedDisplaysKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDisplayPlaneSupportedDisplaysKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetDisplayPlaneSupportedDisplaysKHR(long value) {
        setValue(value);
    }

    public PFNvkGetDisplayPlaneSupportedDisplaysKHR(VkInstance instance) {
        super(instance, new VkString("vkGetDisplayPlaneSupportedDisplaysKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkUInt32 planeIndex, VkUInt32 pDisplayCount, VkDisplayKHR pDisplays, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPhysicalDevice.NULL.getVkAddress(), planeIndex != null ? planeIndex.getVkAddress() : VkPointer.NULL, pDisplayCount != null ? pDisplayCount.getVkAddress() : VkPointer.NULL, pDisplays != null ? pDisplays.getVkAddress() : VkDisplayKHR.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long planeIndex, long pDisplayCount, long pDisplays, long rval);
}

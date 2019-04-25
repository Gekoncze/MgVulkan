package cz.mg.vulkan;

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
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddress(), planeIndex != null ? planeIndex.getVkAddress() : VkPointer.getNullAddress(), pDisplayCount != null ? pDisplayCount.getVkAddress() : VkPointer.NULL, pDisplays != null ? pDisplays.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    protected static native void call(long vkaddress, long physicalDevice, long planeIndex, long pDisplayCount, long pDisplays, long rval);
}

package cz.mg.vulkan;

public class PFNvkGetDisplayPlaneSupportedDisplaysKHR extends VkFunctionPointer {
    public PFNvkGetDisplayPlaneSupportedDisplaysKHR() {
    }

    protected PFNvkGetDisplayPlaneSupportedDisplaysKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetDisplayPlaneSupportedDisplaysKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDisplayPlaneSupportedDisplaysKHR(long value) {
        setValue(value);
    }

    public PFNvkGetDisplayPlaneSupportedDisplaysKHR(VkInstance instance) {
        super(instance, new VkString("vkGetDisplayPlaneSupportedDisplaysKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkUInt32 planeIndex, VkUInt32 pDisplayCount, VkDisplayKHR pDisplays, VkResult rval){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), planeIndex != null ? planeIndex.getVkAddress() : VkPointer.getNullAddressNative(), pDisplayCount != null ? pDisplayCount.getVkAddress() : VkPointer.NULL, pDisplays != null ? pDisplays.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long planeIndex, long pDisplayCount, long pDisplays, long rval);


    public int call(VkPhysicalDevice physicalDevice, int planeIndex, VkUInt32 pDisplayCount, VkDisplayKHR pDisplays){
        return callSimplifiedNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), planeIndex, pDisplayCount != null ? pDisplayCount.getVkAddress() : VkPointer.NULL, pDisplays != null ? pDisplays.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long physicalDevice, int planeIndex, long pDisplayCount, long pDisplays);

}

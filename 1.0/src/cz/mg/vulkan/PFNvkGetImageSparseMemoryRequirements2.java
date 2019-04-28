package cz.mg.vulkan;

public class PFNvkGetImageSparseMemoryRequirements2 extends VkFunctionPointer {
    public PFNvkGetImageSparseMemoryRequirements2() {
    }

    protected PFNvkGetImageSparseMemoryRequirements2(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetImageSparseMemoryRequirements2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetImageSparseMemoryRequirements2(long value) {
        setValue(value);
    }

    public PFNvkGetImageSparseMemoryRequirements2(VkInstance instance) {
        super(instance, new VkString("vkGetImageSparseMemoryRequirements2"));
    }

    public void call(VkDevice device, VkImageSparseMemoryRequirementsInfo2 pInfo, VkUInt32 pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 pSparseMemoryRequirements){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pInfo != null ? pInfo.getVkAddress() : VkPointer.NULL, pSparseMemoryRequirementCount != null ? pSparseMemoryRequirementCount.getVkAddress() : VkPointer.NULL, pSparseMemoryRequirements != null ? pSparseMemoryRequirements.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long pInfo, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements);

}

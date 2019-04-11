package cz.mg.vulkan;

public class PFNvkGetImageSparseMemoryRequirements2KHR extends VkFunctionPointer {
    public PFNvkGetImageSparseMemoryRequirements2KHR() {
    }

    public PFNvkGetImageSparseMemoryRequirements2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetImageSparseMemoryRequirements2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetImageSparseMemoryRequirements2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetImageSparseMemoryRequirements2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetImageSparseMemoryRequirements2KHR"));
    }

    public void call(VkDevice device, VkImageSparseMemoryRequirementsInfo2 pInfo, VkUInt32 pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 pSparseMemoryRequirements){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pInfo != null ? pInfo.getVkAddress() : VkPointer.NULL, pSparseMemoryRequirementCount != null ? pSparseMemoryRequirementCount.getVkAddress() : VkPointer.NULL, pSparseMemoryRequirements != null ? pSparseMemoryRequirements.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pInfo, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements);
}

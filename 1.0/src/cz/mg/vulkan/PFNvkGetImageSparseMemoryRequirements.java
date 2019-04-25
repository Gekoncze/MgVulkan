package cz.mg.vulkan;

public class PFNvkGetImageSparseMemoryRequirements extends VkFunctionPointer {
    public PFNvkGetImageSparseMemoryRequirements() {
    }

    public PFNvkGetImageSparseMemoryRequirements(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetImageSparseMemoryRequirements(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetImageSparseMemoryRequirements(long value) {
        setValue(value);
    }

    public PFNvkGetImageSparseMemoryRequirements(VkInstance instance) {
        super(instance, new VkString("vkGetImageSparseMemoryRequirements"));
    }

    public void call(VkDevice device, VkImage image, VkUInt32 pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements pSparseMemoryRequirements){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), image != null ? image.getVkAddress() : VkPointer.getNullAddress(), pSparseMemoryRequirementCount != null ? pSparseMemoryRequirementCount.getVkAddress() : VkPointer.NULL, pSparseMemoryRequirements != null ? pSparseMemoryRequirements.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long image, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements);
}

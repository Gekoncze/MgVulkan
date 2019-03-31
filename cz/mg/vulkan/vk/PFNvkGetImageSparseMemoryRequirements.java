package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetImageSparseMemoryRequirements.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), image != null ? image.getVkAddress() : VkImage.NULL.getVkAddress(), pSparseMemoryRequirementCount != null ? pSparseMemoryRequirementCount.getVkAddress() : VkPointer.NULL, pSparseMemoryRequirements != null ? pSparseMemoryRequirements.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long image, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements);
}

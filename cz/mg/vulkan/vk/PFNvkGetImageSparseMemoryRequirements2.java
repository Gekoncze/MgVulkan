package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetImageSparseMemoryRequirements2.html">khronos documentation</a>
 **/
public class PFNvkGetImageSparseMemoryRequirements2 extends VkFunctionPointer {
    public PFNvkGetImageSparseMemoryRequirements2() {
    }

    public PFNvkGetImageSparseMemoryRequirements2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetImageSparseMemoryRequirements2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetImageSparseMemoryRequirements2(long value) {
        setValue(value);
    }

    public PFNvkGetImageSparseMemoryRequirements2(VkInstance instance) {
        super(instance, new VkString("vkGetImageSparseMemoryRequirements2"));
    }

    public void call(VkDevice device, VkImageSparseMemoryRequirementsInfo2 pInfo, VkUInt32 pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 pSparseMemoryRequirements){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pInfo != null ? pInfo.getVkAddress() : VkPointer.NULL, pSparseMemoryRequirementCount != null ? pSparseMemoryRequirementCount.getVkAddress() : VkPointer.NULL, pSparseMemoryRequirements != null ? pSparseMemoryRequirements.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pInfo, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements);
}

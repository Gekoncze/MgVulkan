package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdCopyImage.html">khronos documentation</a>
 **/
public class PFNvkCmdCopyImage extends VkFunctionPointer {
    public PFNvkCmdCopyImage() {
    }

    public PFNvkCmdCopyImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdCopyImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdCopyImage(long value) {
        setValue(value);
    }

    public PFNvkCmdCopyImage(VkInstance instance) {
        super(instance, new VkString("vkCmdCopyImage"));
    }

    public void call(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, VkUInt32 regionCount, VkImageCopy pRegions){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), srcImage != null ? srcImage.getVkAddress() : VkImage.NULL.getVkAddress(), srcImageLayout != null ? srcImageLayout.getVkAddress() : VkPointer.NULL, dstImage != null ? dstImage.getVkAddress() : VkImage.NULL.getVkAddress(), dstImageLayout != null ? dstImageLayout.getVkAddress() : VkPointer.NULL, regionCount != null ? regionCount.getVkAddress() : VkPointer.NULL, pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long srcImage, long srcImageLayout, long dstImage, long dstImageLayout, long regionCount, long pRegions);
}

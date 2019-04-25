package cz.mg.vulkan;

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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), srcImage != null ? srcImage.getVkAddress() : VkPointer.getNullAddress(), srcImageLayout != null ? srcImageLayout.getVkAddress() : VkPointer.getNullAddress(), dstImage != null ? dstImage.getVkAddress() : VkPointer.getNullAddress(), dstImageLayout != null ? dstImageLayout.getVkAddress() : VkPointer.getNullAddress(), regionCount != null ? regionCount.getVkAddress() : VkPointer.getNullAddress(), pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long srcImage, long srcImageLayout, long dstImage, long dstImageLayout, long regionCount, long pRegions);
}

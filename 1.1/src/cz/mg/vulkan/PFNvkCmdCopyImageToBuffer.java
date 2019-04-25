package cz.mg.vulkan;

public class PFNvkCmdCopyImageToBuffer extends VkFunctionPointer {
    public PFNvkCmdCopyImageToBuffer() {
    }

    public PFNvkCmdCopyImageToBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdCopyImageToBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdCopyImageToBuffer(long value) {
        setValue(value);
    }

    public PFNvkCmdCopyImageToBuffer(VkInstance instance) {
        super(instance, new VkString("vkCmdCopyImageToBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkBuffer dstBuffer, VkUInt32 regionCount, VkBufferImageCopy pRegions){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), srcImage != null ? srcImage.getVkAddress() : VkPointer.getNullAddress(), srcImageLayout != null ? srcImageLayout.getVkAddress() : VkPointer.getNullAddress(), dstBuffer != null ? dstBuffer.getVkAddress() : VkPointer.getNullAddress(), regionCount != null ? regionCount.getVkAddress() : VkPointer.getNullAddress(), pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long srcImage, long srcImageLayout, long dstBuffer, long regionCount, long pRegions);
}

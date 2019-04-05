package cz.mg.vulkan.vk;

public class PFNvkCmdCopyBufferToImage extends VkFunctionPointer {
    public PFNvkCmdCopyBufferToImage() {
    }

    public PFNvkCmdCopyBufferToImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdCopyBufferToImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdCopyBufferToImage(long value) {
        setValue(value);
    }

    public PFNvkCmdCopyBufferToImage(VkInstance instance) {
        super(instance, new VkString("vkCmdCopyBufferToImage"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer srcBuffer, VkImage dstImage, VkImageLayout dstImageLayout, VkUInt32 regionCount, VkBufferImageCopy pRegions){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, srcBuffer != null ? srcBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, dstImage != null ? dstImage.getVkAddress() : VkPointer.NULL_ADDRESS, dstImageLayout != null ? dstImageLayout.getVkAddress() : VkPointer.NULL_ADDRESS, regionCount != null ? regionCount.getVkAddress() : VkPointer.NULL_ADDRESS, pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long srcBuffer, long dstImage, long dstImageLayout, long regionCount, long pRegions);
}

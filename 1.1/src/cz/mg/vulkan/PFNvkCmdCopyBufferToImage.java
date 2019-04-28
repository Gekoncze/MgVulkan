package cz.mg.vulkan;

public class PFNvkCmdCopyBufferToImage extends VkFunctionPointer {
    public PFNvkCmdCopyBufferToImage() {
    }

    protected PFNvkCmdCopyBufferToImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdCopyBufferToImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdCopyBufferToImage(long value) {
        setValue(value);
    }

    public PFNvkCmdCopyBufferToImage(VkInstance instance) {
        super(instance, new VkString("vkCmdCopyBufferToImage"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer srcBuffer, VkImage dstImage, VkImageLayout dstImageLayout, VkUInt32 regionCount, VkBufferImageCopy pRegions){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), srcBuffer != null ? srcBuffer.getVkAddress() : VkPointer.getNullAddressNative(), dstImage != null ? dstImage.getVkAddress() : VkPointer.getNullAddressNative(), dstImageLayout != null ? dstImageLayout.getVkAddress() : VkPointer.getNullAddressNative(), regionCount != null ? regionCount.getVkAddress() : VkPointer.getNullAddressNative(), pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long srcBuffer, long dstImage, long dstImageLayout, long regionCount, long pRegions);


    public void call(VkCommandBuffer commandBuffer, VkBuffer srcBuffer, VkImage dstImage, int dstImageLayout, int regionCount, VkBufferImageCopy pRegions){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), srcBuffer != null ? srcBuffer.getVkAddress() : VkPointer.getNullAddressNative(), dstImage != null ? dstImage.getVkAddress() : VkPointer.getNullAddressNative(), dstImageLayout, regionCount, pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, long srcBuffer, long dstImage, int dstImageLayout, int regionCount, long pRegions);

}

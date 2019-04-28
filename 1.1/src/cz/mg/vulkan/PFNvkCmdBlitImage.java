package cz.mg.vulkan;

public class PFNvkCmdBlitImage extends VkFunctionPointer {
    public PFNvkCmdBlitImage() {
    }

    protected PFNvkCmdBlitImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdBlitImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdBlitImage(long value) {
        setValue(value);
    }

    public PFNvkCmdBlitImage(VkInstance instance) {
        super(instance, new VkString("vkCmdBlitImage"));
    }

    public void call(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, VkUInt32 regionCount, VkImageBlit pRegions, VkFilter filter){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), srcImage != null ? srcImage.getVkAddress() : VkPointer.getNullAddressNative(), srcImageLayout != null ? srcImageLayout.getVkAddress() : VkPointer.getNullAddressNative(), dstImage != null ? dstImage.getVkAddress() : VkPointer.getNullAddressNative(), dstImageLayout != null ? dstImageLayout.getVkAddress() : VkPointer.getNullAddressNative(), regionCount != null ? regionCount.getVkAddress() : VkPointer.getNullAddressNative(), pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL, filter != null ? filter.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long srcImage, long srcImageLayout, long dstImage, long dstImageLayout, long regionCount, long pRegions, long filter);


    public void call(VkCommandBuffer commandBuffer, VkImage srcImage, int srcImageLayout, VkImage dstImage, int dstImageLayout, int regionCount, VkImageBlit pRegions, int filter){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), srcImage != null ? srcImage.getVkAddress() : VkPointer.getNullAddressNative(), srcImageLayout, dstImage != null ? dstImage.getVkAddress() : VkPointer.getNullAddressNative(), dstImageLayout, regionCount, pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL, filter);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions, int filter);

}

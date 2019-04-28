package cz.mg.vulkan;

public class PFNvkCmdResolveImage extends VkFunctionPointer {
    public PFNvkCmdResolveImage() {
    }

    protected PFNvkCmdResolveImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdResolveImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdResolveImage(long value) {
        setValue(value);
    }

    public PFNvkCmdResolveImage(VkInstance instance) {
        super(instance, new VkString("vkCmdResolveImage"));
    }

    public void call(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, VkUInt32 regionCount, VkImageResolve pRegions){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), srcImage != null ? srcImage.getVkAddress() : VkPointer.getNullAddressNative(), srcImageLayout != null ? srcImageLayout.getVkAddress() : VkPointer.getNullAddressNative(), dstImage != null ? dstImage.getVkAddress() : VkPointer.getNullAddressNative(), dstImageLayout != null ? dstImageLayout.getVkAddress() : VkPointer.getNullAddressNative(), regionCount != null ? regionCount.getVkAddress() : VkPointer.getNullAddressNative(), pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long srcImage, long srcImageLayout, long dstImage, long dstImageLayout, long regionCount, long pRegions);


    public void call(VkCommandBuffer commandBuffer, VkImage srcImage, int srcImageLayout, VkImage dstImage, int dstImageLayout, int regionCount, VkImageResolve pRegions){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), srcImage != null ? srcImage.getVkAddress() : VkPointer.getNullAddressNative(), srcImageLayout, dstImage != null ? dstImage.getVkAddress() : VkPointer.getNullAddressNative(), dstImageLayout, regionCount, pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions);

}

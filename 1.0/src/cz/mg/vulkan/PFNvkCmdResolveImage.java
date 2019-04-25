package cz.mg.vulkan;

public class PFNvkCmdResolveImage extends VkFunctionPointer {
    public PFNvkCmdResolveImage() {
    }

    public PFNvkCmdResolveImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdResolveImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdResolveImage(long value) {
        setValue(value);
    }

    public PFNvkCmdResolveImage(VkInstance instance) {
        super(instance, new VkString("vkCmdResolveImage"));
    }

    public void call(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, VkUInt32 regionCount, VkImageResolve pRegions){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), srcImage != null ? srcImage.getVkAddress() : VkPointer.getNullAddressNative(), srcImageLayout != null ? srcImageLayout.getVkAddress() : VkPointer.getNullAddressNative(), dstImage != null ? dstImage.getVkAddress() : VkPointer.getNullAddressNative(), dstImageLayout != null ? dstImageLayout.getVkAddress() : VkPointer.getNullAddressNative(), regionCount != null ? regionCount.getVkAddress() : VkPointer.getNullAddressNative(), pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long srcImage, long srcImageLayout, long dstImage, long dstImageLayout, long regionCount, long pRegions);
}

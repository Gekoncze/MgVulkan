package cz.mg.vulkan.vk;

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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, srcImage != null ? srcImage.getVkAddress() : VkPointer.NULL_ADDRESS, srcImageLayout != null ? srcImageLayout.getVkAddress() : VkPointer.NULL_ADDRESS, dstImage != null ? dstImage.getVkAddress() : VkPointer.NULL_ADDRESS, dstImageLayout != null ? dstImageLayout.getVkAddress() : VkPointer.NULL_ADDRESS, regionCount != null ? regionCount.getVkAddress() : VkPointer.NULL_ADDRESS, pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long srcImage, long srcImageLayout, long dstImage, long dstImageLayout, long regionCount, long pRegions);
}

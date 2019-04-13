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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), srcImage != null ? srcImage.getVkAddress() : VkPointer.getSinkAddress(), srcImageLayout != null ? srcImageLayout.getVkAddress() : VkPointer.getSinkAddress(), dstImage != null ? dstImage.getVkAddress() : VkPointer.getSinkAddress(), dstImageLayout != null ? dstImageLayout.getVkAddress() : VkPointer.getSinkAddress(), regionCount != null ? regionCount.getVkAddress() : VkPointer.getSinkAddress(), pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long srcImage, long srcImageLayout, long dstImage, long dstImageLayout, long regionCount, long pRegions);
}

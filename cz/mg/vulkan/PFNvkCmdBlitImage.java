package cz.mg.vulkan;

public class PFNvkCmdBlitImage extends VkFunctionPointer {
    public PFNvkCmdBlitImage() {
    }

    public PFNvkCmdBlitImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdBlitImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdBlitImage(long value) {
        setValue(value);
    }

    public PFNvkCmdBlitImage(VkInstance instance) {
        super(instance, new VkString("vkCmdBlitImage"));
    }

    public void call(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, VkUInt32 regionCount, VkImageBlit pRegions, VkFilter filter){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), srcImage != null ? srcImage.getVkAddress() : VkPointer.getSinkAddress(), srcImageLayout != null ? srcImageLayout.getVkAddress() : VkPointer.getSinkAddress(), dstImage != null ? dstImage.getVkAddress() : VkPointer.getSinkAddress(), dstImageLayout != null ? dstImageLayout.getVkAddress() : VkPointer.getSinkAddress(), regionCount != null ? regionCount.getVkAddress() : VkPointer.getSinkAddress(), pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL, filter != null ? filter.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long srcImage, long srcImageLayout, long dstImage, long dstImageLayout, long regionCount, long pRegions, long filter);
}

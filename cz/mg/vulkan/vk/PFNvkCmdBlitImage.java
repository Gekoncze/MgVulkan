package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdBlitImage.html">khronos documentation</a>
 **/
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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), srcImage != null ? srcImage.getVkAddress() : VkImage.NULL.getVkAddress(), srcImageLayout != null ? srcImageLayout.getVkAddress() : VkPointer.NULL, dstImage != null ? dstImage.getVkAddress() : VkImage.NULL.getVkAddress(), dstImageLayout != null ? dstImageLayout.getVkAddress() : VkPointer.NULL, regionCount != null ? regionCount.getVkAddress() : VkPointer.NULL, pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL, filter != null ? filter.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long srcImage, long srcImageLayout, long dstImage, long dstImageLayout, long regionCount, long pRegions, long filter);
}

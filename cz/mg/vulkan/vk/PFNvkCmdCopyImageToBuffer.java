package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdCopyImageToBuffer.html">khronos documentation</a>
 **/
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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), srcImage != null ? srcImage.getVkAddress() : VkImage.NULL.getVkAddress(), srcImageLayout != null ? srcImageLayout.getVkAddress() : VkPointer.NULL, dstBuffer != null ? dstBuffer.getVkAddress() : VkBuffer.NULL.getVkAddress(), regionCount != null ? regionCount.getVkAddress() : VkPointer.NULL, pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long srcImage, long srcImageLayout, long dstBuffer, long regionCount, long pRegions);
}

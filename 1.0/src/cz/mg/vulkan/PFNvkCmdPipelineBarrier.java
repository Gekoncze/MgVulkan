package cz.mg.vulkan;

public class PFNvkCmdPipelineBarrier extends VkFunctionPointer {
    public PFNvkCmdPipelineBarrier() {
    }

    public PFNvkCmdPipelineBarrier(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdPipelineBarrier(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdPipelineBarrier(long value) {
        setValue(value);
    }

    public PFNvkCmdPipelineBarrier(VkInstance instance) {
        super(instance, new VkString("vkCmdPipelineBarrier"));
    }

    public void call(VkCommandBuffer commandBuffer, VkPipelineStageFlags srcStageMask, VkPipelineStageFlags dstStageMask, VkDependencyFlags dependencyFlags, VkUInt32 memoryBarrierCount, VkMemoryBarrier pMemoryBarriers, VkUInt32 bufferMemoryBarrierCount, VkBufferMemoryBarrier pBufferMemoryBarriers, VkUInt32 imageMemoryBarrierCount, VkImageMemoryBarrier pImageMemoryBarriers){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), srcStageMask != null ? srcStageMask.getVkAddress() : VkPointer.getNullAddressNative(), dstStageMask != null ? dstStageMask.getVkAddress() : VkPointer.getNullAddressNative(), dependencyFlags != null ? dependencyFlags.getVkAddress() : VkPointer.getNullAddressNative(), memoryBarrierCount != null ? memoryBarrierCount.getVkAddress() : VkPointer.getNullAddressNative(), pMemoryBarriers != null ? pMemoryBarriers.getVkAddress() : VkPointer.NULL, bufferMemoryBarrierCount != null ? bufferMemoryBarrierCount.getVkAddress() : VkPointer.getNullAddressNative(), pBufferMemoryBarriers != null ? pBufferMemoryBarriers.getVkAddress() : VkPointer.NULL, imageMemoryBarrierCount != null ? imageMemoryBarrierCount.getVkAddress() : VkPointer.getNullAddressNative(), pImageMemoryBarriers != null ? pImageMemoryBarriers.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long srcStageMask, long dstStageMask, long dependencyFlags, long memoryBarrierCount, long pMemoryBarriers, long bufferMemoryBarrierCount, long pBufferMemoryBarriers, long imageMemoryBarrierCount, long pImageMemoryBarriers);
}

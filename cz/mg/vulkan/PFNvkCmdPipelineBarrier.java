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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, srcStageMask != null ? srcStageMask.getVkAddress() : VkPointer.NULL_ADDRESS, dstStageMask != null ? dstStageMask.getVkAddress() : VkPointer.NULL_ADDRESS, dependencyFlags != null ? dependencyFlags.getVkAddress() : VkPointer.NULL_ADDRESS, memoryBarrierCount != null ? memoryBarrierCount.getVkAddress() : VkPointer.NULL_ADDRESS, pMemoryBarriers != null ? pMemoryBarriers.getVkAddress() : VkPointer.NULL, bufferMemoryBarrierCount != null ? bufferMemoryBarrierCount.getVkAddress() : VkPointer.NULL_ADDRESS, pBufferMemoryBarriers != null ? pBufferMemoryBarriers.getVkAddress() : VkPointer.NULL, imageMemoryBarrierCount != null ? imageMemoryBarrierCount.getVkAddress() : VkPointer.NULL_ADDRESS, pImageMemoryBarriers != null ? pImageMemoryBarriers.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long srcStageMask, long dstStageMask, long dependencyFlags, long memoryBarrierCount, long pMemoryBarriers, long bufferMemoryBarrierCount, long pBufferMemoryBarriers, long imageMemoryBarrierCount, long pImageMemoryBarriers);
}
